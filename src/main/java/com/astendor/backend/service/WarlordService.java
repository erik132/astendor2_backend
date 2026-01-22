package com.astendor.backend.service;

import com.astendor.backend.antlr.WarlordOrder;
import com.astendor.backend.antlr.WarlordOrderParser;
import com.astendor.backend.entity.Warlord;
import com.astendor.backend.entity.WarlordOrders;
import com.astendor.backend.repository.WarlordOrdersRepository;
import com.astendor.backend.repository.WarlordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WarlordService {

    @Autowired
    private WarlordOrdersRepository warlordOrdersRepository;

    @Autowired
    private WarlordRepository warlordRepository;

    public void saveWarlordOrders(WarlordOrders warlordOrders) {
        warlordOrdersRepository.save(warlordOrders);
    }

    public void deleteWarlordOrders(Integer warlordId){
        warlordOrdersRepository.deleteById(warlordId);
    }

    public void processWorldWarlordOrders(Integer worldId) {
        List<Warlord> warlords = warlordRepository.findByWorldId(worldId);
        for (Warlord warlord : warlords) {
            if (!warlord.isWarlordBusy()) {
                List<WarlordOrder> orders = parseWarlordOrders(warlord.getId());
                if (orders == null || orders.isEmpty()) {
                    continue;
                }
                String returningOrders = null;
                int unfulfilledOrdersStart = 0;
                for (WarlordOrder order : orders) {
                    boolean result = order.carryOutOrder(warlordRepository, warlord.getId());
                    if (result) {
                        unfulfilledOrdersStart++;
                    } else {
                        break;
                    }
                    if (order.isOrderFullTurn()) {
                        break;
                    }
                }
                if (unfulfilledOrdersStart != orders.size()) {
                    returningOrders = WarlordOrderParser.ordersBackToString(orders.subList(unfulfilledOrdersStart, orders.size()));
                }
                if (returningOrders != null) {
                    saveWarlordOrders(new WarlordOrders(warlord.getId(), returningOrders));
                } else {
                    deleteWarlordOrders(warlord.getId());
                }
            }
        }
    }

    public List<WarlordOrder> parseWarlordOrders(Integer warlordId) {
        Optional<WarlordOrders> opOrders = warlordOrdersRepository.findById(warlordId);
        return opOrders.map(this::parseWarlordOrders).orElse(null);
    }

    private List<WarlordOrder> parseWarlordOrders(WarlordOrders orders) {
        WarlordOrderParser parser = new WarlordOrderParser();
        List<WarlordOrder> orderList = parser.parserOrders(orders.getOrderText());
        return orderList;
    }

    public Warlord joinWorld(Integer worldId, Integer userId, Integer raceId) {
        if (warlordRepository.existsByWorldIdAndUserId(worldId, userId)) {
            throw new RuntimeException("User already joined this world");
        }
        Warlord warlord = new Warlord(worldId, userId, raceId, 1, 1);
        return warlordRepository.save(warlord);
    }
}

package com.astendor.backend.service;

import com.astendor.backend.antlr.WarlordOrder;
import com.astendor.backend.antlr.WarlordOrderParser;
import com.astendor.backend.entity.Warlord;
import com.astendor.backend.entity.WarlordOrders;
import com.astendor.backend.repository.WarlordOrdersRepository;
import com.astendor.backend.repository.WarlordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<WarlordOrder> processWarlordOrders(Integer warlordId) {
        Optional<WarlordOrders> opOrders = warlordOrdersRepository.findById(warlordId);
        if (opOrders.isPresent()) {
            return processWarlordOrders(opOrders.get());
        }
        return new ArrayList<>();
    }

    private List<WarlordOrder> processWarlordOrders(WarlordOrders orders) {
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

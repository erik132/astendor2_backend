package com.astendor.backend.controller;

import com.astendor.backend.antlr.WarlordOrder;
import com.astendor.backend.dto.JoinWorldRequest;
import com.astendor.backend.dto.SetWarlordOrdersRequest;
import com.astendor.backend.entity.User;
import com.astendor.backend.entity.Warlord;
import com.astendor.backend.entity.WarlordOrders;
import com.astendor.backend.repository.UserRepository;
import com.astendor.backend.service.WarlordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WarlordController {

    @Autowired
    private WarlordService warlordService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/set_warlord_orders")
    public ResponseEntity<String> setWarlordOrders(@RequestBody SetWarlordOrdersRequest request) {
        WarlordOrders orders = new WarlordOrders(request.getWarlordId(), request.getOrderText());
        warlordService.saveWarlordOrders(orders);
        return ResponseEntity.ok("Orders saved");
    }

    @GetMapping("/order_test")
    public ResponseEntity<List<WarlordOrder>> testWarlordOrders(@RequestParam("warlord_id") Integer warlordId){
        return ResponseEntity.ok(warlordService.parseWarlordOrders(warlordId));
    }

    @PostMapping("/join_world")
    public ResponseEntity<?> joinWorld(@RequestBody JoinWorldRequest request) {
        try {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            String username = authentication.getName();

            User user = userRepository.findByUsername(username)
                    .orElseThrow(() -> new RuntimeException("User not found"));

            Warlord warlord = warlordService.joinWorld(request.getWorldId(), user.getId(), request.getRaceId());
            return ResponseEntity.ok(warlord);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}

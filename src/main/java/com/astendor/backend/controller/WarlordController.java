package com.astendor.backend.controller;

import com.astendor.backend.antlr.WarlordOrder;
import com.astendor.backend.dto.SetWarlordOrdersRequest;
import com.astendor.backend.entity.WarlordOrders;
import com.astendor.backend.service.WarlordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WarlordController {

    @Autowired
    private WarlordService warlordService;

    @PostMapping("/set_warlord_orders")
    public ResponseEntity<String> setWarlordOrders(@RequestBody SetWarlordOrdersRequest request) {
        WarlordOrders orders = new WarlordOrders(request.getWarlordId(), request.getOrderText());
        warlordService.saveWarlordOrders(orders);
        return ResponseEntity.ok("Orders saved");
    }

    @GetMapping("/order_test")
    public ResponseEntity<List<WarlordOrder>> testWarlordOrders(@RequestParam("warlord_id") Integer warlordId){
        return ResponseEntity.ok(warlordService.processWarlordOrders(warlordId));
    }
}

package com.astendor.backend.controller;

import com.astendor.backend.dto.CraftItemRequest;
import com.astendor.backend.entity.TileCraftingQueue;
import com.astendor.backend.entity.TileCraftingQueueInfo;
import com.astendor.backend.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping("/craft_item")
    public ResponseEntity<String> craftItem(@RequestBody CraftItemRequest request) {
        try {
            itemService.addToCraftingQueue(
                    request.getWorldId(),
                    request.getTileId(),
                    request.getBlueprintId(),
                    request.getAmount()
            );
            return ResponseEntity.ok("success");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @GetMapping("/get_crafting_queue")
    public ResponseEntity<List<TileCraftingQueueInfo>> getCraftingQueue(
            @RequestParam("world_id") Integer worldId,
            @RequestParam("tile_id") Integer tileId) {
        List<TileCraftingQueueInfo> queue = itemService.getCraftingQueue(worldId, tileId);
        return ResponseEntity.ok(queue);
    }
}

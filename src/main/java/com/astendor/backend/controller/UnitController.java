package com.astendor.backend.controller;

import com.astendor.backend.dto.TrainUnitRequest;
import com.astendor.backend.entity.TileTrainingQueue;
import com.astendor.backend.entity.TileTrainingQueueInfo;
import com.astendor.backend.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UnitController {

    @Autowired
    private UnitService unitService;

    @PostMapping("/train_unit")
    public ResponseEntity<String> trainUnit(@RequestBody TrainUnitRequest request) {
        try {
            unitService.addToTrainingQueue(
                    request.getWorldId(),
                    request.getTileId(),
                    request.getTemplateId(),
                    request.getAmount()
            );
            return ResponseEntity.ok("success");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @GetMapping("/get_training_queue")
    public ResponseEntity<List<TileTrainingQueueInfo>> getTrainingQueue(
            @RequestParam("world_id") Integer worldId,
            @RequestParam("tile_id") Integer tileId) {
        List<TileTrainingQueueInfo> queue = unitService.getTrainingQueue(worldId, tileId);
        return ResponseEntity.ok(queue);
    }
}

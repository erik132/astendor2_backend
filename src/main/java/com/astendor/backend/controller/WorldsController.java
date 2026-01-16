package com.astendor.backend.controller;

import com.astendor.backend.entity.WorldDescription;
import com.astendor.backend.entity.WorldTileHarvestInfo;
import com.astendor.backend.entity.WorldTilesInfo;
import com.astendor.backend.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class WorldsController {

    @Autowired
    private WorldService worldService;

    @GetMapping("/worlds")
    public ResponseEntity<List<WorldDescription>> getWorlds() {
        List<WorldDescription> worlds = worldService.getAllWorlds();
        return ResponseEntity.ok(worlds);
    }

    @GetMapping("/world_tiles_info")
    public ResponseEntity<?> getWorldTilesInfo(@RequestParam("world_id") Integer worldId) {
        List<WorldTilesInfo> tilesInfo = worldService.getWorldTilesInfo(worldId);
        if (tilesInfo.isEmpty()) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("message", "World not found"));
        }
        return ResponseEntity.ok(tilesInfo);
    }

    @GetMapping("/world_tile_harvest_info")
    public ResponseEntity<?> getWorldTileHarvestInfo(@RequestParam("tile_id") Integer tileId) {
        List<WorldTileHarvestInfo> harvestInfo = worldService.getWorldTileHarvestInfo(tileId);
        if (harvestInfo.isEmpty()) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("message", "Tile not found"));
        }
        return ResponseEntity.ok(harvestInfo);
    }
}

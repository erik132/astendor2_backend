package com.astendor.backend.controller;

import com.astendor.backend.entity.WorldDescription;
import com.astendor.backend.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorldsController {

    @Autowired
    private WorldService worldService;

    @GetMapping("/worlds")
    public ResponseEntity<List<WorldDescription>> getWorlds() {
        List<WorldDescription> worlds = worldService.getAllWorlds();
        return ResponseEntity.ok(worlds);
    }
}

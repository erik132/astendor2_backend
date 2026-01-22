package com.astendor.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnService {

    @Autowired
    private ItemService itemService;

    @Autowired
    private WorldService worldService;

    @Autowired
    private WarlordService warlordService;

    public void endTurn(Integer worldId) {
        worldService.processWorldHarvests(worldId);
        worldService.processWorldCraftingQueues(worldId);
        worldService.processWorldTrainingQueues(worldId);
        warlordService.processWorldWarlordOrders(worldId);
        //checkForConflicts
    }


}

package com.astendor.backend.service;

import com.astendor.backend.entity.WorldDescription;
import com.astendor.backend.entity.WorldTileHarvestInfo;
import com.astendor.backend.entity.WorldTilesInfo;
import com.astendor.backend.repository.WorldDescriptionRepository;
import com.astendor.backend.repository.WorldTileHarvestInfoRepository;
import com.astendor.backend.repository.WorldTilesInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorldService {

    @Autowired
    private WorldDescriptionRepository worldDescriptionRepository;

    @Autowired
    private WorldTilesInfoRepository worldTilesInfoRepository;

    @Autowired
    private WorldTileHarvestInfoRepository worldTileHarvestInfoRepository;

    public List<WorldDescription> getAllWorlds() {
        return worldDescriptionRepository.findAll();
    }

    public List<WorldTilesInfo> getWorldTilesInfo(Integer worldId) {
        return worldTilesInfoRepository.findByWorldId(worldId);
    }

    public List<WorldTileHarvestInfo> getWorldTileHarvestInfo(Integer tileId) {
        return worldTileHarvestInfoRepository.findByTileId(tileId);
    }

    public void processWorldHarvests(Integer worldId) {
        worldTilesInfoRepository.processHarvests(worldId);
    }

    public void processWorldCraftingQueues(Integer worldId) {
        worldTilesInfoRepository.processCraftingQueues(worldId);
    }

    public void processWorldTrainingQueues(Integer worldId) {
        worldTilesInfoRepository.processTrainingQueues(worldId);
    }
}

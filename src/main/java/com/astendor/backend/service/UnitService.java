package com.astendor.backend.service;

import com.astendor.backend.entity.TileTrainingQueue;
import com.astendor.backend.entity.TileTrainingQueueInfo;
import com.astendor.backend.repository.TileTrainingQueueInfoRepository;
import com.astendor.backend.repository.TileTrainingQueueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitService {

    @Autowired
    private TileTrainingQueueRepository tileTrainingQueueRepository;

    private TileTrainingQueueInfoRepository tileTrainingQueueInfoRepository;

    public TileTrainingQueue addToTrainingQueue(Integer worldId, Integer tileId, Integer templateId, Integer amount) {
        TileTrainingQueue queueEntry = new TileTrainingQueue(worldId, tileId, templateId, amount);
        return tileTrainingQueueRepository.save(queueEntry);
    }

    public List<TileTrainingQueueInfo> getTrainingQueue(Integer worldId, Integer tileId) {
        return tileTrainingQueueInfoRepository.findByWorldIdAndTileId(worldId, tileId);
    }
}

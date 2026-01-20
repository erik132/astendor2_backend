package com.astendor.backend.service;

import com.astendor.backend.entity.TileCraftingQueue;
import com.astendor.backend.entity.TileCraftingQueueInfo;
import com.astendor.backend.repository.TileCraftingQueueInfoRepository;
import com.astendor.backend.repository.TileCraftingQueueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private TileCraftingQueueRepository tileCraftingQueueRepository;

    @Autowired
    private TileCraftingQueueInfoRepository tileCraftingQueueInfoRepository;

    public TileCraftingQueue addToCraftingQueue(Integer worldId, Integer tileId, Integer blueprintId, Integer amount) {
        TileCraftingQueue queueEntry = new TileCraftingQueue(worldId, tileId, blueprintId, amount);
        return tileCraftingQueueRepository.save(queueEntry);
    }

    public List<TileCraftingQueueInfo> getCraftingQueue(Integer worldId, Integer tileId) {
        return tileCraftingQueueInfoRepository.findByWorldIdAndTileId(worldId, tileId);
    }
}

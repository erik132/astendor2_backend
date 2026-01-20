package com.astendor.backend.repository;

import com.astendor.backend.entity.TileCraftingQueueInfo;
import com.astendor.backend.entity.TileTrainingQueueInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TileTrainingQueueInfoRepository extends JpaRepository<TileTrainingQueueInfo, Integer> {

    List<TileTrainingQueueInfo> findByWorldIdAndTileId(Integer worldId, Integer tileId);
}

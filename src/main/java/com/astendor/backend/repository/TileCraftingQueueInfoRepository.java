package com.astendor.backend.repository;

import com.astendor.backend.entity.TileCraftingQueueInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TileCraftingQueueInfoRepository extends JpaRepository<TileCraftingQueueInfo, Integer> {

    List<TileCraftingQueueInfo> findByWorldIdAndTileId(Integer worldId, Integer tileId);
}

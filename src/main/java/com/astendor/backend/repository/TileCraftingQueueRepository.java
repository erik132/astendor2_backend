package com.astendor.backend.repository;

import com.astendor.backend.entity.TileCraftingQueue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TileCraftingQueueRepository extends JpaRepository<TileCraftingQueue, Integer> {

    List<TileCraftingQueue> findByWorldIdAndTileId(Integer worldId, Integer tileId);
}

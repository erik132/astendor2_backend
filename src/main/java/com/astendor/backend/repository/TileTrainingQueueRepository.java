package com.astendor.backend.repository;

import com.astendor.backend.entity.TileTrainingQueue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TileTrainingQueueRepository extends JpaRepository<TileTrainingQueue, Integer> {

    List<TileTrainingQueue> findByWorldIdAndTileId(Integer worldId, Integer tileId);
}

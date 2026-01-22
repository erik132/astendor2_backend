package com.astendor.backend.repository;

import com.astendor.backend.entity.WorldTilesInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorldTilesInfoRepository extends JpaRepository<WorldTilesInfo, Integer> {

    List<WorldTilesInfo> findByWorldId(Integer worldId);

    @Procedure(procedureName = "process_world_harvests")
    void processHarvests(Integer world_id);

    @Procedure(procedureName = "process_world_crafting_queue")
    void processCraftingQueues(Integer world_id);

    @Procedure(procedureName = "process_world_training_queue")
    void processTrainingQueues(Integer world_id);
}

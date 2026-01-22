package com.astendor.backend.repository;

import com.astendor.backend.entity.Warlord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarlordRepository extends JpaRepository<Warlord, Integer> {

    boolean existsByWorldIdAndUserId(Integer worldId, Integer userId);
    List<Warlord> findByWorldId(Integer worldId);

    @Procedure(procedureName = "move_warlord")
    void moveWarlord(Integer warlordId, Integer xAmount, Integer yAmount);
}

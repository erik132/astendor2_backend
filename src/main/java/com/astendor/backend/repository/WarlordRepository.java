package com.astendor.backend.repository;

import com.astendor.backend.entity.Warlord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarlordRepository extends JpaRepository<Warlord, Integer> {

    boolean existsByWorldIdAndUserId(Integer worldId, Integer userId);
}

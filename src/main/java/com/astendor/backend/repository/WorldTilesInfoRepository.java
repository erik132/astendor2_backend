package com.astendor.backend.repository;

import com.astendor.backend.entity.WorldTilesInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorldTilesInfoRepository extends JpaRepository<WorldTilesInfo, Integer> {
    List<WorldTilesInfo> findByWorldId(Integer worldId);
}

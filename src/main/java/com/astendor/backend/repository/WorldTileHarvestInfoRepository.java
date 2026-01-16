package com.astendor.backend.repository;

import com.astendor.backend.entity.WorldTileHarvestInfo;
import com.astendor.backend.entity.WorldTileHarvestInfoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorldTileHarvestInfoRepository extends JpaRepository<WorldTileHarvestInfo, WorldTileHarvestInfoId> {
    List<WorldTileHarvestInfo> findByTileId(Integer tileId);
}

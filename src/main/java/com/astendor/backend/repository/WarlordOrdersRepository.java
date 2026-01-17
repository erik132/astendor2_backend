package com.astendor.backend.repository;

import com.astendor.backend.entity.WarlordOrders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarlordOrdersRepository extends JpaRepository<WarlordOrders, Integer> {
}

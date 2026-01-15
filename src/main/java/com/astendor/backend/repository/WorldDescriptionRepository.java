package com.astendor.backend.repository;

import com.astendor.backend.entity.WorldDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorldDescriptionRepository extends JpaRepository<WorldDescription, Integer> {
}

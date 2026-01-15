package com.astendor.backend.service;

import com.astendor.backend.entity.WorldDescription;
import com.astendor.backend.repository.WorldDescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorldService {

    @Autowired
    private WorldDescriptionRepository worldDescriptionRepository;

    public List<WorldDescription> getAllWorlds() {
        return worldDescriptionRepository.findAll();
    }
}

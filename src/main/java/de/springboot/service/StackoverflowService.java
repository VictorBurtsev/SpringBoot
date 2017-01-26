package de.springboot.service;

import de.springboot.model.StackoverflowWebsite;
import de.springboot.persistence.StackoverflowWebsiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StackoverflowService {
    @Autowired
    private StackoverflowWebsiteRepository repository;

    public List<StackoverflowWebsite> findAll() {
        return repository.findAll();
    }
}

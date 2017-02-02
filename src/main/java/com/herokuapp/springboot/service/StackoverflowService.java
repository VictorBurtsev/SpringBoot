package com.herokuapp.springboot.service;

import com.herokuapp.springboot.model.StackoverflowWebsite;
import com.herokuapp.springboot.persistence.StackoverflowWebsiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StackoverflowService {
    @Autowired
    private StackoverflowWebsiteRepository repository;

    public List<StackoverflowWebsite> findAll() {
        return repository.findAll();
    }
}

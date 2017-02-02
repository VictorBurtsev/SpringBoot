package com.herokuapp.springboot.web;

import com.herokuapp.springboot.model.StackoverflowWebsite;
import com.herokuapp.springboot.service.StackoverflowServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/stackoverflow")
public class StackoverflowControllerAPI {
    @Autowired
    private StackoverflowServiceAPI stackoverflowServiceAPI;

    @RequestMapping
    public List<StackoverflowWebsite> getListOfProviders() {
        return stackoverflowServiceAPI.findAll();
    }
}

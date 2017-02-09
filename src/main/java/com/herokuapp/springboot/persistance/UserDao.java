package com.herokuapp.springboot.persistance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class UserDao {
    @Autowired
    private MongoTemplate mongoTemplate;
}

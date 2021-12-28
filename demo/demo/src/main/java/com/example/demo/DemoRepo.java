package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface DemoRepo extends MongoRepository<Demo,String> {
    Demo findDemoByName(String name);
    Demo deleteDemoByName(String name);
    Demo findDemoByAge(int age);
    }


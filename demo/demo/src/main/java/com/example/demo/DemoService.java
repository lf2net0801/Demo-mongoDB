package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("demoService")
public class DemoService{

    @Autowired
    private DemoRepo demoRepo;


    public List<Demo> findall(){
      return demoRepo.findAll();
    }

    public Demo findByAge(int age){
        return demoRepo.findDemoByAge(age);
    }

//    public void insert(Demo demo){
//        demoRepo.save(demo);
//    }
//
//    public void delete(String name){
//        demoRepo.deleteDemoByName(name);
//    }
//
//    public Demo findbyname(String name) {
//        return demoRepo.findDemoByName(name);
//    }
}

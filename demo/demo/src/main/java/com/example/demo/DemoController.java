package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/getData")
    public List<Demo> getData(){
        return demoService.findall();
    }

    @GetMapping("/getData/{age}")
    public Demo getByAge(@PathVariable int age){
        return demoService.findByAge(age);
    }
}

package com.example.beta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/door")
public class ResourceController {

    @GetMapping("/hello")
    public String hello (){
        return "Welcome to RESOURCE-WORLD!";
    }
}

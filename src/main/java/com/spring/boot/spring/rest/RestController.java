package com.spring.boot.spring.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    //expose '/' that returns
    @GetMapping("/")
    public String sayHello(){
        return "Hello World " + LocalDateTime.now();
    }
}

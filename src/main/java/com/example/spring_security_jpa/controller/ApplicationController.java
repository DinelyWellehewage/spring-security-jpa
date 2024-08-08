package com.example.spring_security_jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping("/")
    public String home(){
        return "welcome";
    }

    @GetMapping("/admin")
    public String admin(){
        return "welcome admin";
    }

    @GetMapping("/user")
    public String user(){
        return "welcome user";
    }
}

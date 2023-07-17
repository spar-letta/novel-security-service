package com.javenock.jwtauthservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dest")
public class DestController {

    @GetMapping
    public String destString(){
        return "hello from os "+System.getProperty("os.name");
    }
}

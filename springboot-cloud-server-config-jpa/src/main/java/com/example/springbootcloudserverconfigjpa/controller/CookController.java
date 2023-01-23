package com.example.springbootcloudserverconfigjpa.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MessageResource {
    @Value("${message: Default hello}")
    private String message;
    @GetMapping("/message")
    public String message(){
        return message;
    }
}

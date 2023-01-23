package com.example.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
    @GetMapping("/message")
    public String getMessage(){
        return "Hello how are you";
    }
}

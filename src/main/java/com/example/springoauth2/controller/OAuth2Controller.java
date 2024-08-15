package com.example.springoauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuth2Controller {

    @GetMapping("/")
    public String oauth2(){
        return "Hello, OAuth2!";
    }

    @GetMapping("/secured")
    public String secured(){
        return "Hello, Secured!";
    }
}

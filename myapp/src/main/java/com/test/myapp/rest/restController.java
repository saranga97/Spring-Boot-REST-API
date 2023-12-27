package com.test.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

    //expose a "/" endpoint for hello world
    @GetMapping("/")
    public String sayHello(){
        return "Hello world";
    }

}

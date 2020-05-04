package com.ceb.manager.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @RequestMapping("/test")
    public String test(@RequestParam(name="name", defaultValue="world") String name){
        return String.format("Hello %s!",name);
    }
}
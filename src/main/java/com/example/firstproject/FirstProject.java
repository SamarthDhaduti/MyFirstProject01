package com.example.firstproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstProject {

    @RequestMapping("/hello")
    public String sayHello(){

        return "Hello World";
    }

    @RequestMapping("/hello/{name}")
    public String SayHelloToSomeone(@PathVariable("name") String name){

        return "Hello Namaste " + name;
    }
    
}

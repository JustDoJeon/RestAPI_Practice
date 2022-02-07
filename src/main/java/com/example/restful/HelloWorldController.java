package com.example.restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //GET
    // /hello-world (end point)
    @GetMapping("/hello-world")
    public String helloworld(){
        System.out.println("HelloWorldController.helloworld");
        return "Hello World";
    }


    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloworldBean(){
        return new HelloWorldBean("Hello World");
    }




}

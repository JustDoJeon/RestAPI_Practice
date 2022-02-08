package com.example.restful.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello world, %s" ,name));
    }




}

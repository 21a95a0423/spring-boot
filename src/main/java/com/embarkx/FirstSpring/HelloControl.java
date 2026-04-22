package com.embarkx.FirstSpring;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloControl {
//    @GetMapping("/hello/{name}/show")
//    public HelloResponse Hello1(@PathVariable String name){
//        return  new HelloResponse("hello world"+name);
 //   }
    @GetMapping("/")
    public HelloResponse Hello(){
        return  new HelloResponse("Hello from EC2!");
    }
    @PostMapping("/hello")
    public HelloResponse HelloPost(@RequestBody String name){
        return new HelloResponse("Hello "+ name +"!!");
    }
    @GetMapping("/health")
    public String health() {
        return "App is running OK!";
    }

}

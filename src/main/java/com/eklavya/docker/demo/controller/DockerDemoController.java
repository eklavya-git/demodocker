package com.eklavya.docker.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dockerdemo")
public class DockerDemoController {


    @GetMapping("/docker")
    public String demoMehtod(){
        return "hello Docker";

    }
}

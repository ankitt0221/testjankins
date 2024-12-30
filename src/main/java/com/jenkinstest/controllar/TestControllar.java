package com.jenkinstest.controllar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/tests")
public class TestControllar {

    @GetMapping
    public  String testString(){
        return "test";
    }

    @GetMapping("/test")
    public  String retuenMassage(){
        return "hello how are you! i am from DM";
    }
}

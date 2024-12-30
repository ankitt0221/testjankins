package com.jenkinstest.controllar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/tests")
public class TestControllar {

    @GetMapping
    public  String testString(){
        return "test";
    }
}

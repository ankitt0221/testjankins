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

    @GetMapping("/msg")
    public String test(){
        return "test";
    }

    @GetMapping("/get")
    public String get(){
        return "how to get jenkins ";
    }

    @GetMapping("/send")
    public String send(){
        return "i was send test message can you check it in DM";
    }

    @GetMapping("/getData")
    public String getData(){
        return "hello how to get jenkins " +
                "how are you? " +
                "I am from DM " +
                "what about you? " +
                "i was create dev test  " +
                "it's working fine " +
                "now i have testing  " +
                "Successfully dev test  ";
    }
}

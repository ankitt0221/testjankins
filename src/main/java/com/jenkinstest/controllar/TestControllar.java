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

        StringBuffer sb = new StringBuffer();
        sb.append("hello how to get jenkins ");
        sb.append("how are you? ");
        sb.append("I am from DM ");
        sb.append("what about you? ");
        sb.append("i was create dev test  ");
        sb.append("it's working fine ");
        sb.append("now i have testing  ");
        sb.append("sucessfully dev test  ");
        return sb.toString();
    }
}

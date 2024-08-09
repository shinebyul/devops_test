package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public void test(){
        System.out.println("8월 9일 DevOps 수업 - 수정");
    }

}

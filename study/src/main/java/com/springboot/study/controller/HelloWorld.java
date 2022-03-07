package com.springboot.study.controller;

import com.mao.datastruct.list.MyLinkedListUtil;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorld {

    @GetMapping("/")
    public String helloWorld(){
        MyLinkedListUtil<String> myLinkedListUtil = new MyLinkedListUtil<>();
        return "hello!";
    }
}

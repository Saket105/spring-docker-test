package com.saket.firstspring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        log.info("hello get url is getting called: {}","hello");
        return "<h1>Hello Spring...</h1>";
    }

    @PostMapping("/hello")
    public String helloPost(@RequestBody String name){
        log.info("hello post method url is getting called: {}",name);
        return "Hello "+name+"!";
    }

    @GetMapping("/")
    public Map<String, Object> getValues(){
        log.info("root url is getting called.....");
        Map<String,Object> data = new HashMap<>();
        data.put("message","Java api is working fine");
        data.put("languages", Arrays.asList("Java","JavaScript","Python","GoLang"));
        data.put("code",254785);
        return data;
    }
}

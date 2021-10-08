package com.example.springwebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MyController {
    public int counter = 0;
    @RequestMapping(method = RequestMethod.GET, path = "/test", produces = "application/json")
    public Map<String, Integer> hello() {
        counter++;
        Map<String, Integer> map = new HashMap<>();
        map.put("counter", counter);
        return map;
    }
}

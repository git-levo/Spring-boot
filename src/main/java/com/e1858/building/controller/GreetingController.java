package com.e1858.building.controller;

/*
*@Author Feng2018
*@Date 2018/3/6
*/

import com.e1858.building.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template="Hello,%s!";
    private final AtomicLong counter=new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam("name")String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
}

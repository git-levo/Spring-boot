package com.e1858.building.controller;

/*
*@Author Feng2018
*@Date 2018/3/2
*/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/")
    public String say(){
        logger.info("Logback.");
        logger.error("Hello! Spring boot .");
        return "Hello! Spring boot .";
    }
}

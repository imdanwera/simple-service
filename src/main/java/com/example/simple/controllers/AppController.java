package com.example.simple.controllers;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;

@RestController
@RequestMapping("/api/app")
public class AppController {

    Logger logger = LoggerFactory.getLogger(AppController.class);

    @GetMapping("/hi")
    public String sayHello(){
        logger.info("INFO: WelCome!");
        System.out.println("Hello");
        logger.info("INFO: Bye !!!");
        return "Hello\n";

    }
}

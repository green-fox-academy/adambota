package com.greenfoxacademy.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHello() {
        return "index";
    }
}

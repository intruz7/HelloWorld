package com.MyProject.HelloWorld.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class MainController
{
    @GetMapping("/")
    @ResponseBody
    public String home()
    {
        return "Hello World";
    }
}

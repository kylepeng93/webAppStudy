package com.linux4fun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    @GetMapping("/")
    public String sayHello(String name) {
        return "index";
    }
}

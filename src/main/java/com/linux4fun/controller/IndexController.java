package com.linux4fun.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.linux4fun.request.ThreadRequest;


@Controller
public class IndexController {
    @GetMapping("/")
    public String sayHello(String name) {
        return "index";
    }
    
    @GetMapping("/request")
    public String requestMe(@Valid ThreadRequest request) {
    	return "success";
    }
}

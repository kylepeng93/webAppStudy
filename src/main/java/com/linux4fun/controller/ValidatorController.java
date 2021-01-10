package com.linux4fun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ValidatorController {
	
	@GetMapping("/validate")
	public String validate() {
		return null;
		
	}
}

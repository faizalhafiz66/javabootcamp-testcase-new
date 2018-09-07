package com.Javabootcamp.spring.controller;

import org.springframework.stereotype.Controller;

@Controller
public class loginController {
	
	public String loginForm() {
		
		return "users/login";
	}

}

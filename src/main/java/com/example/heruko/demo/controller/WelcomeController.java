package com.example.heruko.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {
	
	@GetMapping("/")
	public String welcome() {
	return "Welcome to spring bot heruku demo";
}

}
	
package com.example.demo;

import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

public class Display { 
	@RequestMapping("/sam") 
	public String display() {
		return "<h1>Hi! this is my first spring web app<h1>";
	}

}

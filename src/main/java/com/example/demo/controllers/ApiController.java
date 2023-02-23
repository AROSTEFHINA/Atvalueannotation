package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@Value("${value}")
	private String name;
	@GetMapping("/show")
	public String display() {
		return "hi everyone "+name;
	}
}
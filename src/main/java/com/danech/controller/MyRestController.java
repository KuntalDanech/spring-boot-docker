package com.danech.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	@GetMapping("welcome")
	public ResponseEntity<String> welcome(){
		return  ResponseEntity.ok().body("Welcome to Spring Boot Container based deployment");
	}
}
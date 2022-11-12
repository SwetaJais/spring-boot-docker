package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@GetMapping("/dock")
	 public String test()
	 {
		return "Welcome to Spring Boot Dockerize World";
	 }
}

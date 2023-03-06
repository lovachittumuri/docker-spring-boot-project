package com.lova.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/{name}")
	public String homePage(@PathVariable String name) {
		System.out.println("Good Morning " + name);
		return "Good Morning " + name;
	}

}

package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	int a[];
	int b=0;
	@RequestMapping("/hello")
	public String  data() {
		return "Hello";
	}
//	@PostMapping("/post")
//	public void update() {
//		
//	}

}

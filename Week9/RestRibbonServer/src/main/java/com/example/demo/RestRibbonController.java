package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestRibbonController {

	
	@GetMapping("/")
	public String health() {
		return "I am Ok";
	}
	
   
}

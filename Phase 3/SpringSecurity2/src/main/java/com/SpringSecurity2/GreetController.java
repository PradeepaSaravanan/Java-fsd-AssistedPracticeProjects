package com.SpringSecurity2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	@GetMapping("/")
	public String getMessage() {
		return "<h1> Hello All</h1>";
	}
}

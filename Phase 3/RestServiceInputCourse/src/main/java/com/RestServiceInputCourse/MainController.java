package com.RestServiceInputCourse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/courseinfo")
	public Course getCourse() {
		Course c=new Course();
		c.setId(1);
		c.setCoure_name("Spring Boot in Java");
		c.setFees(1600);
		c.setDuration(1.5);
		return c;
	}
}

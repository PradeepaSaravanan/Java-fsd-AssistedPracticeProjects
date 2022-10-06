package com.RestServiceCourse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class MainController {

	@GetMapping("/info") //@RequestMapping(value="/info", method="get")
    public Course display() {
    	RestTemplate resttemplate=new RestTemplate();
    	Course c=resttemplate.getForObject("http://localhost:8081/courseinfo", Course.class);
    	//return p.toString();
    	return c;
	}
}

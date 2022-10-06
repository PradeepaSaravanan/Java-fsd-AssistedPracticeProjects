package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path="/webapi")
public class FeedbackController {

	@Autowired
	FeedbackService feedbackservice;
	@GetMapping("/listall")
	public List<Feedback> CourseFeedbacks()
	{
		
      return feedbackservice.CourseFeedbacks();
		
	}
	@PostMapping("/add")
	public void addFeedback_to_course(@RequestBody Feedback f)
	{
		feedbackservice.addFeedback_to_course(f);	
	}
}
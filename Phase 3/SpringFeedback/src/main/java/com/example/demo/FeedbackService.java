package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class FeedbackService {
	@Autowired
	FeedbackRepository feedbackRepository;
	
 
    
    public List<Feedback> CourseFeedbacks(){
        return feedbackRepository.findAll();
    }
    public void addFeedback_to_course(Feedback f){
    	feedbackRepository.save(f);
    }
}

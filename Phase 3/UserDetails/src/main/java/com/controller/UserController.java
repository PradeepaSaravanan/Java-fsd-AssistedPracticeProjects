	package com.controller;

	import java.util.List;

	import javax.servlet.http.HttpServletRequest;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.servlet.ModelAndView;

	import com.bean.User;
	import com.service.UserService;

	@Controller
	public class UserController {

		
		@Autowired
		UserService userService;
		
		@RequestMapping(value = "storeUser",method = RequestMethod.POST)
		public ModelAndView storeUser(HttpServletRequest req, User user) {
			int id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			float marks = Float.parseFloat(req.getParameter("marks"));
			String course = req.getParameter("course");
			
			user.setId(id);
			user.setName(name);
			user.setCourse(course);
			user.setMarks(marks);
			
			String result = userService.storeUser(user);
			ModelAndView mav = new ModelAndView();
			mav.addObject("msg", result);
			mav.setViewName("storeUser.jsp");
			return mav;
		}
		
		
		@RequestMapping(value = "updateUser",method = RequestMethod.POST)
		public ModelAndView updateUser(HttpServletRequest req, User user) {
			int id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			float marks= Float.parseFloat(req.getParameter("marks"));
			String course = req.getParameter("course");
			
			user.setId(id);
			user.setName(name);
			user.setCourse(course);
			user.setMarks(marks);
			
			String result = userService.updateUser(user);
			ModelAndView mav = new ModelAndView();
			mav.addObject("msg", result);
			//mav.setViewName("updateUser.jsp");
			if(result.equals("success")) {
				mav.setViewName("success.jsp");
			}else {
				mav.setViewName("failure.jsp");
			}
			return mav;
		}
		
		
		
		@RequestMapping(value = "searchUser",method = RequestMethod.GET)
		public ModelAndView searchUser(HttpServletRequest req) {
			int id = Integer.parseInt(req.getParameter("id"));
			
			String result = userService.searchUser(id);
			ModelAndView mav = new ModelAndView();
			if(result.equals("failure")) {
				mav.setViewName("notfound.jsp");
			}else {
			mav.addObject("msg", result);
			mav.setViewName("updateUser.jsp");
			}
			return mav;
		}
		
		
	}

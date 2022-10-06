package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import beans.Employee;
import dao.EmployeeDao;

@Controller
public class EmployeeController {
    @Autowired
	EmployeeDao dao;
    @RequestMapping("/viewemp")
    public String viewemp(Model model)
    {
    	List<Employee> empList=dao.getEmployeeDetails();
    	model.addAttribute("empList", empList);
    	return "viewemp";
    }
}

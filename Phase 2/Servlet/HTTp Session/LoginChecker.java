package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginChecker")
public class LoginChecker extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginChecker() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uname= request.getParameter("username");
	String pword = request.getParameter("password");
	PrintWriter out= response.getWriter();
	if(uname.equals("Admin") && pword.equals("admin")){
		out.println("You are Welcomed");
	}
	else
		out.println("Invalid Username or Password");
	
	}

	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String uname=request.getParameter("username");
			String pword=request.getParameter("password");
			PrintWriter out=response.getWriter();
			
			RequestDispatcher rd;
			
			if(uname.equals("Kannan") && pword.equals("Gokul@19"))
			{
				HttpSession session= request.getSession(true);
				out.println("session id="+session.getId());
				session.setAttribute("username", uname);
				 rd= request.getRequestDispatcher("Welcome");
				 rd.forward(request, response);
				
			}else
			{
				out.println("INvalid username or password");
				rd= request.getRequestDispatcher("index.html");
				rd.include(request, response);
			}
	}

}

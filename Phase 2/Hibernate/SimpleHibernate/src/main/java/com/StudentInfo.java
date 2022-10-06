package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class StudentInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StudentInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

 int register(Student s){
    	
    	/*
    	 		
		Configuration config= new Configuration();
		SessionFactory sf= config.configure().buildSessionFactory();
		Session s=sf.openSession();
		 Transaction t=s.beginTransaction();
    	 */
    	
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
	 int i=(Integer)session.save(s);
		session.getTransaction().commit();

		session.close();
		return i;

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		int std= Integer.parseInt(request.getParameter("std"));
		
		Student s= new Student();
		s.setName(name);
		s.setStandard(std);
		
		int i=register(s);
		if(i>0) out.println("modifued");
		else out.println(" not modifued");
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

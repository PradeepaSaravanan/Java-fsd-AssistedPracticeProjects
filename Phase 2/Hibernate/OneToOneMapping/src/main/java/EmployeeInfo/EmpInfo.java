package EmployeeInfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmpInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EmpInfo() {
        super();
        // TODO Auto-generated constructor stub
    }
    int register(Employeedetaila user){
    	
    	/*
    	 		
		Configuration config= new Configuration();
		SessionFactory sf= config.configure().buildSessionFactory();
		Session s=sf.openSession();
		 Transaction t=s.beginTransaction();
    	 */
    	
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
	 int i=(Integer)session.save(user);
		session.getTransaction().commit();

		session.close();
		return i;

	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name= request.getParameter("name");
		String Email= request.getParameter("email");
		String AdressLine1= request.getParameter("AL1");
		String city= request.getParameter("city");
		String state= request.getParameter("state");
		String country= request.getParameter("country");
		int pincode= Integer.parseInt(request.getParameter("code"));
		PrintWriter out= response.getWriter();
		Employeedetaila e1=new Employeedetaila();    
	    e1.setName(name);    
	    e1.setEmail(Email);    
	        
	    Address address1=new Address();    
	    address1.setAddressLine1(AdressLine1);    
	    address1.setCity(city);    
	    address1.setState(state);    
	    address1.setCountry(country); 
	    address1.setPincode(pincode);
	    //address1.setPincode(201301);    
	    //to set relationship pass address object to employee and employee object to address    
	    e1.setAdress(address1);    
	    address1.setEmployee(e1); 
	    // register(e1);
	    int i= register(e1);
	    
	    if(i>0)
	    	out.println("modified");
	    else
	    	out.println("not modified");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

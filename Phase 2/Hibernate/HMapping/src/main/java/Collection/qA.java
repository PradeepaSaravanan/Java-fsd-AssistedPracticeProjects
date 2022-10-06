package Collection;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class qA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public qA() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		PrintWriter out= response.getWriter();
		String q1= request.getParameter("q1");
		String q2= request.getParameter("q2");
		
		
		Configuration config= new Configuration();
		SessionFactory sf= config.configure().buildSessionFactory();
		Session s=sf.openSession();
		 Transaction t=s.beginTransaction();
		 
		 ArrayList<String> l1= new ArrayList<String>();
		 l1.add("java is programming language");
		 l1.add("Platform independent");
		 
		 ArrayList<String> l2= new ArrayList<String>();
		 l2.add("Servlet is an interface");
		 l2.add("servlet is an API");
		 
		 Question qn1= new Question();
			qn1.setQn(q1);
			qn1.setAnswer(l1);
			
			Question qn2= new Question();
			qn2.setQn(q2);
			qn2.setAnswer(l2);
			//.save(qn1);
			s.save(qn1);
			s.save(qn2);
			t.commit();
			s.close();
		
	out.println("success");		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package ManyToMany;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class RSInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RSInfo() {
        super();
        // TODO Auto-generated constructor stub
    }
    int register(Set<Reader>r)
    {
    	
    	SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session s= sf.openSession();
		s.beginTransaction();
		int i = 0;
		for(Reader obj:r)
		{
			i=(Integer)s.save(obj);
		}
		
    	s.getTransaction().commit();
    	s.close();
    	return i;
    	
    }
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int sid= Integer.parseInt(request.getParameter("sub_id"));
		//int rid=Integer.parseInt(request.getParameter("r_id"));
       String sname=request.getParameter("sub_name");
       String rname= request.getParameter("r_name");
      
       Set<Reader> readers= new HashSet<Reader>();
       Reader r1=new Reader();
       r1.setRname(rname);
      // Reader r2=new Reader();
     //  r2.setRname(rname);
       readers.add(r1);
     //  readers.add(r2);
       
       Set<Subscription> subscripts= new HashSet<Subscription>();
       Subscription s1= new Subscription();
       s1.setSub_name(sname);
      // Subscription s2= new Subscription();
     //  s2.setSub_name(sname);
       subscripts.add(s1);
      // subscripts.add(s2);
       
       r1.setSubcripts(subscripts);
      // r2.setSubcripts(subscripts);
       s1.setReaders(readers);
      // s2.setReaders(readers);
       
       PrintWriter out= response.getWriter();
      int i= register(readers);
       if(i>0)  out.println("Recoed inserted");
       else out.println("Recoed  not inserted");
    	   
       
       
       
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

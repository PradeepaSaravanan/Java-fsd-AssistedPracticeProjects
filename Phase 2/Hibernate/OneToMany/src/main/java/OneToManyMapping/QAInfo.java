package OneToManyMapping;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class QAInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public QAInfo() {
        super();
        // TODO Auto-generated constructor stub
    }


	int register(Question question1){
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		//session.save(question1);
		 int i=(Integer)session.save(question1);
		session.getTransaction().commit();
		return i;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out= response.getWriter();
		String qn1=request.getParameter("qn1");
		String ans1= request.getParameter("ans1");
		String Author1= request.getParameter("author1");
		String a1= request.getParameter("a1");
		String A1= request.getParameter("A1");
		
	/*	String qn2=request.getParameter("qn2");
		String ans2= request.getParameter("ans2");
		String Author2= request.getParameter("author2");
		String a2= request.getParameter("a2");
		String A2= request.getParameter("A2");*/
		
		ArrayList<Answer> ansList= new ArrayList<Answer>();
		
		Question question1=new Question();
		 question1.setQn(qn1);
		 question1.setAnswers(ansList);
		
		 
		 
		 Answer answer1=new Answer();
		 answer1.setAnswers(ans1);
		 answer1.setPostedBy(Author1);
		 ansList.add(answer1);
		 
		 Answer answer2=new Answer();
		 answer2.setAnswers(a1);
		 answer2.setPostedBy(A1);
		 ansList.add(answer2); 
	    
		int i=register(question1);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

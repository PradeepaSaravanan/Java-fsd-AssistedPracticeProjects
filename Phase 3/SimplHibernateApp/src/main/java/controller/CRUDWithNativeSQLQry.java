package controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class CRUDWithNativeSQLQry {
	
	public static SessionFactory getCurrentSessionFactory() {
		SessionFactory sesFactory = null;
		Configuration config = new Configuration();
		config.configure();
		final StandardServiceRegistry registrty = new StandardServiceRegistryBuilder().configure().build();
		try {

			sesFactory = new MetadataSources(registrty).buildMetadata().buildSessionFactory();
		} catch (HibernateException ex) {

			ex.printStackTrace();
			StandardServiceRegistryBuilder.destroy(registrty);
		}

		return sesFactory;
	}

	public static void main(String[] args) {
		
		CRUDWithNativeSQLQry  natQryObj = new CRUDWithNativeSQLQry();
		
		natQryObj.getStudentListThruNatSQLQuery();
	}
	
public static void getStudentListThruNatSQLQuery() {
		
	   
		int studentId;
		String studentName;
		String studentCity;
        NativeQuery natQry;
		Scanner studFeed = new Scanner(System.in);

		System.out.println("NATIVE SQL Query: Please enter city name based on which students are to be fetched :");
		studentCity = studFeed.nextLine();
		
		Session readSession = getCurrentSessionFactory().openSession();
		
		readSession.beginTransaction();
		
				
		natQry = readSession.createNativeQuery("select student_id,student_name from student where student_city ='"+studentCity +"'");
		
		List<Object[]> studentList = natQry.list();
		
        readSession.getTransaction().commit();
        
		for (Object[] student: studentList) {
			Student stud = new Student();
			stud.setStudentId(Integer.parseInt(student[0].toString()));
			stud.setStudentName(student[1].toString());
			stud.setStudentCity(studentCity);
		    System.out.println(stud);
				}

		readSession.close();
		
	}
	

}

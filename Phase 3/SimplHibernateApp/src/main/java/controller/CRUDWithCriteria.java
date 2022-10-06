package controller;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;


public class CRUDWithCriteria {
	
	
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
	
	@SuppressWarnings("deprecation")
	public static void getStudentListThruHibCriteria() {
		
		
		int studentId;
		String studentName;
		String studentCity;
        Criteria hibCriteria;
       	Scanner studFeed = new Scanner(System.in);

		studentId = generateStudentId();

		System.out.println("Hibernate Criteria :Please enter city name based on which students are to be fetched :");
		studentCity = studFeed.nextLine();
		
		Session readSession = getCurrentSessionFactory().openSession();
		
		readSession.beginTransaction();
		
		hibCriteria = readSession.createCriteria(Student.class);

		hibCriteria.add(Restrictions.eq("studentCity", studentCity));
		
		List<Student> studentList = hibCriteria.list();
		
		readSession.getTransaction().commit();
		
		studentList.stream().map(studObj -> studObj.getStudentName() + " is having student id  "
				+ studObj.getStudentId() + " is " + "from " + studObj.getStudentCity()).forEach(System.out::println);

		readSession.close();
		
	}
	
	public static void getStudentListThruJPACriteria() {
		
		int studentId;
		String studentName;
		String studentCity;
        CriteriaBuilder critBuilder;
		Scanner studFeed = new Scanner(System.in);

		studentId = generateStudentId();

		System.out.println("JPA Criteria : Please enter city name based on which students are to be fetched :");
		studentCity = studFeed.nextLine();
		
		Session readSession = getCurrentSessionFactory().openSession();
		
		readSession.beginTransaction();
		
		critBuilder = readSession.getCriteriaBuilder();
		
		CriteriaQuery <Student> CritQuery = critBuilder.createQuery(Student.class);
		
		Root<Student> rootObj = CritQuery.from(Student.class);
		
		CritQuery.select(rootObj).where(critBuilder.equal(rootObj.get("studentCity"), studentCity));
				
		Query<Student> studQuery = readSession.createQuery(CritQuery);
		
		List<Student> studentList = studQuery.getResultList();
		
        readSession.getTransaction().commit();
		
		studentList.stream().map(studObj -> studObj.getStudentName() + " is having student id  "
				+ studObj.getStudentId() + " is " + "from " + studObj.getStudentCity()).forEach(System.out::println);

		readSession.close();
		
	}
	
	public static void main(String[] args) {

		Scanner selectOprn = new Scanner(System.in);
		System.out.println("Choose below options : ");
		System.out.println("");
		System.out.println("");
		System.out.println("Choose 'R' for Read students list data operation based on city using JPA Criteria");
		System.out.println("");
		System.out.println("Choose 'r' for Read students list data operation based on city using Hibernate Criteria");
		System.out.println("");
		

		char opern = selectOprn.next().charAt(0);

		switch (opern) {

		
		case 'R':

			System.out.println("Reading student details :");
			getStudentListThruJPACriteria();
			break;
		case 'r':

			System.out.println("Getting  student list details :");
			getStudentListThruHibCriteria();
			break;

		
		default:
			System.out.println("You have entered  invalid operation");
			break;

		}

	}

	private static int generateStudentId() {

		Random rdmNum = new Random();
		int studentId = rdmNum.nextInt(9999);
		return Integer.parseInt(String.format("%04d", studentId));

	}


}

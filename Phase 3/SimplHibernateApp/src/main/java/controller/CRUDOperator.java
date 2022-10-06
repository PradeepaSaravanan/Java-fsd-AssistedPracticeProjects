package controller;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CRUDOperator {

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

	public static void createStudent() {

		Student studentObj;
		int studentId;
		String studentName;
		String studentCity;

		Scanner studFeed = new Scanner(System.in);

		studentId = generateStudentId();

		System.out.println("Please enter student name :");

		studentName = studFeed.nextLine();

		System.out.println("Please enter student city :");
		studentCity = studFeed.nextLine();

		studentObj = new Student(studentId, studentName, studentCity);

		// Hibernate create/insert operation begins

		Session createSession = getCurrentSessionFactory().openSession();

		createSession.beginTransaction();

		//createSession.save(studentObj); //save method deprecated

		createSession.persist(studentObj);

		createSession.getTransaction().commit();

		createSession.close();
		System.out.println("Following are the details of student who has been added :");
		System.out.println(studentObj.toString());

	}

	public static void readStudentList() {

		int studentId;
		String studentName;
		String studentCity;

		Scanner studFeed = new Scanner(System.in);

		studentId = generateStudentId();

		System.out.println("Please enter city name based on which students are to be fetched :");
		studentCity = studFeed.nextLine();

		String hqlQuery = "FROM Student stud WHERE stud.studentCity='" + studentCity
				+ "' ORDER BY stud.studentName DESC";

		Session readSession = getCurrentSessionFactory().openSession();

		readSession.beginTransaction();

		List<Student> studentList = readSession.createQuery(hqlQuery).list();

		readSession.getTransaction().commit();

		studentList.stream().map(studObj -> studObj.getStudentName() + " is having student id  "
				+ studObj.getStudentId() + " is " + "from " + studObj.getStudentCity()).forEach(System.out::println);

		readSession.close();
	}

	public static void readStudentById() {

		int studentId;

		Scanner studFeed = new Scanner(System.in);

		System.out.println("Please enter id of student whose details  to be fetched :");
		studentId = studFeed.nextInt();

		String hqlQuery = "FROM Student stud WHERE stud.studentId='" + studentId + "' ORDER BY stud.studentName DESC";

		Session readSession = getCurrentSessionFactory().openSession();

		readSession.beginTransaction();

		Student studObj = readSession.get(Student.class, studentId);

		readSession.getTransaction().commit();

		if (studObj != null) {

			System.out.println("Student with id  " + studentId + "  and Name " + studObj.getStudentName() + " is from "
					+ studObj.getStudentCity());
		} else {
			System.out.println("Student with id  " + studentId + " does not exist !");
		}
		readSession.close();

	}

	public static void updateStudent() {

		int studentId;
		String studentName;
		String studentCity;

		Scanner idFeed = new Scanner(System.in);
		Scanner cityFeed = new Scanner(System.in);
		System.out.println("Please enter student id whose city needs to be updated :");
		studentId = idFeed.nextInt();
		System.out.println("Please enter new city of student :");
		studentCity = cityFeed.nextLine();
		Session updateSession = getCurrentSessionFactory().openSession();

		Student studObj = updateSession.get(Student.class, studentId);
		if (studObj != null) {

			studObj.setStudentCity(studentCity);

			updateSession.beginTransaction();
			updateSession.update(studObj);
			updateSession.getTransaction().commit();

			System.out.println(
					"Student with id " + studentId + " has been updated with " + studentCity + " as city of origin");
		} else {
			System.out.println("Student with id " + studentId + " does not exist !");
		}
		updateSession.close();
	}

	public static void deleteStudentById() {

		int studentId;
		String studentName;
		String studentCity;

		Scanner studFeed = new Scanner(System.in);

		System.out.println("Please enter id of student who needs to be removed  :");
		studentId = studFeed.nextInt();

		Session deleteSession = getCurrentSessionFactory().openSession();

		Student studObj = deleteSession.get(Student.class, studentId);
		if (studObj != null) {

			// deleteSession.delete(studObj);
			deleteSession.beginTransaction();

			deleteSession.remove(studObj);

			deleteSession.getTransaction().commit();

			System.out.println("Student with id " + studentId + " has been removed");
		} else {
			System.out.println("Student with id " + studentId + " does not exist !");
		}

		deleteSession.close();
	}

	public static void main(String[] args) {

		Scanner selectOprn = new Scanner(System.in);
		System.out.println("Choose below options : ");
		System.out.println("");
		System.out.println("Choose 'C' for create student operation");
		System.out.println("");
		System.out.println("Choose 'R' for Read student data operation");
		System.out.println("");
		System.out.println("Choose 'r' for Read students list data operation based on city ");
		System.out.println("");
		System.out.println("Choose 'U' for update student operation");
		System.out.println("");
		System.out.println("Choose 'D' for delete student operation");
		System.out.println("");

		char opern = selectOprn.next().charAt(0);

		switch (opern) {

		case 'C':

			System.out.println("Creating / adding new Student :");
			createStudent();
			break;

		case 'R':

			System.out.println("Reading student details :");
			readStudentById();
			break;
		case 'r':

			System.out.println("Getting  student list details :");
			readStudentList();
			break;

		case 'U':

			System.out.println("Updating student details :");
			updateStudent();
			break;

		case 'D':

			System.out.println("Deleting student details : ");
			deleteStudentById();
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

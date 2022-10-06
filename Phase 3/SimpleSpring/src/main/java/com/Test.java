package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		
		// first way - not popularly used nowadays
		Resource res= new ClassPathResource("application.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory= new XmlBeanFactory(res);
		Student s=(Student)factory.getBean("stud");
		System.out.println("name "+s.getName());
		
		//second way
		
	ApplicationContext ctx= new ClassPathXmlApplicationContext("application.xml");
		Student s2=(Student)ctx.getBean("stud");
		System.out.println("name="+s2.getName());
		
		 Student stud1=(Student)ctx.getBean("stud1");
			System.out.println("name="+stud1.getName());
		

	}

}

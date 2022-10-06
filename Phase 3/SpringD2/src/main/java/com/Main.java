package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		TextEditor obj = (TextEditor)context.getBean("editor");
		obj.spellCheck();
		
		context.close();

	}

}

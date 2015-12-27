package org.ramya.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		
	    Student student=(Student)ac.getBean("studentbean");  
	    student.displayInfo();
	}
}

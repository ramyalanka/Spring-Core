package org.ramya.bean;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("****************** SINGLETON SCOPE ******************");
	    User singletonUser1 = (User)ac.getBean("singletonUser");
	    singletonUser1.setName("Ramu");
	    singletonUser1.setDate(new Date());
	    
	    System.out.println(singletonUser1.toString());
	    
	    User singletonUser2 = (User)ac.getBean("singletonUser");
	    System.out.println(singletonUser2.toString());
	    
	    
	    
	    
	    System.out.println("****************** PROTOTYPE SCOPE ******************");
	    User prototypeUser1 = (User)ac.getBean("prototypeUser");
	    prototypeUser1.setName("Ramu");
	    prototypeUser1.setDate(new Date());
	    
	    System.out.println(prototypeUser1.toString());
	    
	    User prototypeUser2 = (User)ac.getBean("prototypeUser");
	    System.out.println(prototypeUser2.toString());
	    
	}
}

package org.ramya.bean.user;

import org.ramya.bean.User;
import org.ramya.bean.exam.Answer;
import org.ramya.bean.exam.Question;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		try{
			User user=(User)ac.getBean("user");
			if(null != user)
				System.out.println("User is registered as a bean.");
		} catch(Exception ex){}
		
		try{
		Question qstn=(Question)ac.getBean("question");
		if(null != qstn)
			System.out.println("Question is registered as a bean.");
		} catch(Exception ex){}
		
		try{
		Answer answer=(Answer)ac.getBean("answer");
		if(null != answer)
			System.out.println("Answer is registered as a bean.");
		} catch(Exception ex){}
	}
}

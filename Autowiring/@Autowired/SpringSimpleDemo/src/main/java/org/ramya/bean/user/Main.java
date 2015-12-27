package org.ramya.bean.user;

import org.ramya.bean.User;
import org.ramya.bean.exam.Answer;
import org.ramya.bean.exam.Question;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		User user=(User)ac.getBean("user");
		
		try{
		Question qstn=user.getQuestion();
		if(null != qstn)
			System.out.println("Question is injected in User.");
		} catch(Exception ex){}
		
		try{
		Answer answer=user.getAnswer();
		if(null != answer)
			System.out.println("Answer is injected in User.");
		} catch(Exception ex){}
	}
}

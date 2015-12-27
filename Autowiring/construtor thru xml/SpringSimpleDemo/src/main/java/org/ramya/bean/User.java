package org.ramya.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
public class User {
	private int id;  
	private String name,email; 
	private Question question;
	private Answer answer;
	
	public User(Question question, Answer answer){
		this.question = question;
		this.answer = answer;
	}
}

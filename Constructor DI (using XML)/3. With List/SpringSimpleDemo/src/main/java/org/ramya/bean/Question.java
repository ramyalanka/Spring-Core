package org.ramya.bean;

import java.util.Iterator;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Question {
	private int id;  
	private String name;  
	private List<String> answers;
	
	public Question(int id, String name, List<String> answers) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.answers = answers;  
	}  
	  
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println("answers are:");  
	    Iterator<String> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  
}

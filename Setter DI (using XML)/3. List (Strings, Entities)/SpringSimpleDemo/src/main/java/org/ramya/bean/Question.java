package org.ramya.bean;

import java.util.Iterator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Question {
	private int id;  
	private String name;
	private List<String> answers; 
	private List<Answer> answerList;  
	
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println("answers are:");  
	    Iterator<String> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	    Iterator<Answer> itr1=answerList.iterator();  
	    while(itr1.hasNext()){  
	        System.out.println(itr1.next());  
	    }
	}
}

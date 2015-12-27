package org.ramya.bean;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Question {
	private int id;  
	private String name;
	private Map<String,String> answers; 
	private Map<Answer,User> answerMap;  
	
	public void displayInfo(){  
		System.out.println("question id:"+id);  
	    System.out.println("question name:"+name);  
	    System.out.println("Answers....");  
	    Set<Entry<String, String>> set=answers.entrySet();  
	    Iterator<Entry<String, String>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<String,String> entry=itr.next();  
	        System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());  
	    }  
	    Set<Entry<Answer, User>> set1=answerMap.entrySet();  
	    Iterator<Entry<Answer, User>> itr1=set1.iterator();  
	    while(itr1.hasNext()){  
	        Entry<Answer, User> entry=itr1.next();  
	        Answer ans=entry.getKey();  
	        User user=entry.getValue();  
	        System.out.println("Answer Information:");  
	        System.out.println(ans);  
	        System.out.println("Posted By:");  
	        System.out.println(user);  
	    }  
	}
}

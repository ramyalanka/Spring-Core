package org.ramya.bean;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Question {
	private int id;  
	private String name;
	private Map<String,String> answers; 
	private Map<Answer,User> answersMap;
	
	public Question(int id, String name, Map<String, String> answers, Map<Answer,User> answersMap) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.answers = answers;
	    this.answersMap = answersMap;
	}  
	  
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println("answers are:");  
	    Set<Entry<String, String>> set=answers.entrySet();  
	    Iterator<Entry<String, String>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<String,String> entry=itr.next();  
	        System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());  
	    }
	    
	    System.out.println("Answers in Map....");  
	    Set<Entry<Answer, User>> set2 = answersMap.entrySet();  
	    Iterator<Entry<Answer, User>> iterator =set2.iterator();  
	    while(iterator.hasNext()){  
	        Entry<Answer, User> entry=iterator.next();  
	        Answer ans=entry.getKey();  
	        User user=entry.getValue();  
	        System.out.println("Answer Information:");  
	        System.out.println(ans);  
	        System.out.println("Posted By:");  
	        System.out.println(user);  
	    }  
	}  
}

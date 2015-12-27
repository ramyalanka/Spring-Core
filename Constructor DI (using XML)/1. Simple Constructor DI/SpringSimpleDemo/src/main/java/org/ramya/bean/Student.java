package org.ramya.bean;

import lombok.Getter;

@Getter
public class Student {
	 private String name;

	public Student(String name){
		this.name = name;
		System.out.println("Constructor called : "+name);
	}
	 
	 public void displayInfo(){  
	    System.out.println("Hello: "+name);  
	 }  
}

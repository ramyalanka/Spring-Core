package org.ramya.bean;

import lombok.Getter;

@Getter
public class Student {
	 private String name;

	public void setName(String name) {
		this.name = name;
		System.out.println("Setter called : "+name);
	}
	 
	 public void displayInfo(){  
	    System.out.println("Hello: "+name);  
	 }  
}

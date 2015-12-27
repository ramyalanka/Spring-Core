package org.ramya.bean;

import lombok.Getter;

@Getter
public class Student {
	 private String name;
	 private Address address;
	public Student(String name, Address address){
		this.name = name;
		this.address = address;
		System.out.println("Constructor called : "+name);
	}
	 
	 public void displayInfo(){  
	    System.out.println("Hello: "+name);  
	    System.out.println("Adress: "+address.toString());  
	 }  
}

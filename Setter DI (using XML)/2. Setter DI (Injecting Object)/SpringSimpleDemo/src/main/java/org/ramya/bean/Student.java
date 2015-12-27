package org.ramya.bean;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Student {
	 private String name;
	 private Address address;
	 
	 public void displayInfo(){  
	    System.out.println("Hello: "+name);  
	    System.out.println("Adress: "+address.toString());  
	 }  
}

package org.howard.edu.lsp.midterm.problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Person { 
	private String name; 
	private int age; 
	private String socialsecurityNumber;
	
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
			
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		
		Person p = (Person) obj;
		String ssn1 = this.socialsecurityNumber.toString();
		String ssn2 = p.socialsecurityNumber.toString();
		if (ssn1 != ssn2) {
			return false;
		}
		return true;
	}

	public Person(String name, int age,String socialsecurityNumber) {
		// initialize private variables
		this.name = name;
		this.age = age;
		this.socialsecurityNumber = socialsecurityNumber;
	}
	

	
	public String toString() {
		return name + " " + age + " " + socialsecurityNumber;
	}
} 

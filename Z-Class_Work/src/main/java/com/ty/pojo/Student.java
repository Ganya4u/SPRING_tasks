package com.ty.pojo;

import java.util.List;

public class Student {
	
	String name;
    List<Subject> subjects;
	public void setName(String name) {
		this.name = name;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
	
    
	public void display() {
	    System.out.println("Student Name: " + name);

	    if (subjects != null && !subjects.isEmpty()) {
	        System.out.println("Subjects:");
	        for (Subject subject : subjects) {
	        	
	        	System.out.println(" Sub Id : " + subject.id);
	        	
	            System.out.println(" Sub Name : " + subject.name);
	           
	        }
	    } else {
	        System.out.println("No subjects assigned.");
	    }
	}


}

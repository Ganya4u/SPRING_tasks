package com.ty.pojo2;

import java.util.List;

public class Student {
	
	String name;
    List<Subject> subjects;
    
    
	
	
    
	public Student() {
		super();
	}


	public Student(String name, List<Subject> subjects) {
		super();
		this.name = name;
		this.subjects = subjects;
	}





	public void display() {
        System.out.println("Student Name: " + name);

        if (subjects != null && !subjects.isEmpty()) {
            System.out.println("Subjects:");
            for (Subject subject : subjects) {
                System.out.println(" Sub Id : " + subject.getId());
                System.out.println(" Sub Name : " + subject.getName());
            }
        } else {
            System.out.println("No subjects assigned.");
        }
	}


}

package com.ty.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


// setter injection 
@Component
public class Employee {
	
	private String name;
	private String email;
	private double salary;
	
	@Value(value = "Rahul")
	public void setName(String name) {
		this.name = name;
	}
	@Value(value = "Rahul@gmail.com")
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Value(value = "70000")
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Salary : " + salary);
	}
	
	

}

package com.ty.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Student {
	
	String name ;
	long phone ;
	
	
	public Student(@Value(value = "Ganesh") String name,@Value(value = "789456123") long phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Phone : " + phone);
	}
	

}

package com.ty.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//field injection 

@Component(value = "per")
public class Person {

	@Value(value = "Rahul")
	String name;

	@Value(value = "23")
	int age;

	public void details() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

	public void read() {
		System.out.println("Person is reading the book");
	}
}

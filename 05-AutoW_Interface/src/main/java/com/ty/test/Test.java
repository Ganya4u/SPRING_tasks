package com.ty.test;

import org.springframework.context.ConfigurableApplicationContext;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.config.AppConfig;

import com.ty.pojo.Person;


public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person p = (Person)app.getBean(Person.class);
		p.details();
		
		
		
		
	     

	}

}

package com.ty.test;

import org.springframework.context.ConfigurableApplicationContext;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.config.AppConfig;
import com.ty.pojo.Aadhar;

import com.ty.pojo.User;


public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		 User user = app.getBean(User.class);
		 user.display();
		 user.adhaar.info();
		 
		 Aadhar adhaar = (Aadhar) app.getBean("adhaarBean");
	        adhaar.info();
		
		
		
	     

	}

}

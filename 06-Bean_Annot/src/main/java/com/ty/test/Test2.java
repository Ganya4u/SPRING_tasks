package com.ty.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.config.AppConfig;
import com.ty.pojo.Aadhar;
import com.ty.pojo.User;

public class Test2 {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		User user = app.getBean(User.class);
		System.out.println(user);

		User user1 = app.getBean(User.class);
		System.out.println(user1);

		User user2 = app.getBean(User.class);
		System.out.println(user2);
		
		Aadhar a1 = app.getBean(Aadhar.class);
		System.out.println(a1);
		
		Aadhar a2 = app.getBean(Aadhar.class);
		System.out.println(a2);
		
		Aadhar a3 = app.getBean(Aadhar.class);
		System.out.println(a3);

	}

}

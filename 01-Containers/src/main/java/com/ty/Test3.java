package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		
   ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config2.xml");
		
		Student std = (Student) app.getBean("pid1");
		
		std.cry();

	}

}

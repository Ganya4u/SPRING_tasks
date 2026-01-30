package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Using J2EE

public class Test1 {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
		
		Person person = (Person) app.getBean("pid1");
		
		person.run();

	}

}

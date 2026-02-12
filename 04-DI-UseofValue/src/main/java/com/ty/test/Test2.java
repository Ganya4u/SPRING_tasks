package com.ty.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.config.AppConfig;
import com.ty.pojo.Car;


public class Test2 {
	
public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car c = (Car) app.getBean(Car.class);
		c.drive();
		
	     

	}

}

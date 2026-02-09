package com.ty.obj;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config3.xml");
         
		Car car = (Car) app.getBean("carBean");
		System.out.println(car.brand);
		car.drive();

	}

}

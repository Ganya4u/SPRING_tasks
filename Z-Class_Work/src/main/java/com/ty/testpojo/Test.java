package com.ty.testpojo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.pojo.Shop;
import com.ty.pojo.Student;
import com.ty.pojo.Subject;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("type1.xml");
		
		   Subject subject = (Subject) app.getBean("sub1");
		   
		   subject.display();
		   
		   System.out.println("---------------------------------");
		
		   Student stu = (Student) app.getBean("student");
		   
		   stu.display();
		
		   System.out.println("---------------------------------");
			
		   
		   Shop shop = (Shop) app.getBean("shop");
		   
		   shop.display();

	}

}

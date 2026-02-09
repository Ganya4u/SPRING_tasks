package com.ty.testpojo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.pojo2.Shop;
import com.ty.pojo2.Student;
import com.ty.pojo2.Subject;


// import from pojo2

public class Test2 {

	public static void main(String[] args) {
		
	
			
				ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("type2.xml");
				
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




	



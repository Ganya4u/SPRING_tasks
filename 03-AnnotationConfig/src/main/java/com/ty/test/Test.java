package com.ty.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.config.AppConfig;
import com.ty.pojo.AppDemo;
import com.ty.pojo.CustomClassId;
import com.ty.pojo.DEMO;
import com.ty.pojo.Student;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student student = (Student) app.getBean("student");
		student.play();
		
		AppDemo  ad = (AppDemo ) app.getBean("appDemo");
		ad.show();
		
		
		DEMO d = (DEMO) app.getBean("DEMO");
		d.display();
		
		CustomClassId cid = (CustomClassId) app.getBean("cci");
		cid.run();
		
		
		
		Student stu = app.getBean(Student.class);
		stu.play();
	     

	}

}

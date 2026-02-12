package com.ty.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	 @Value("Ganya Bhai")
	    String name;

	   @Value("23")
	    int age;
	   
	   @Autowired
	   @Qualifier (value = "oppo")
	    Mobile mobile;
	   
	   public void details() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        mobile.call();
	    }

}

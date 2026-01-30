package com.ty;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test4 {

	public static void main(String[] args) {
		
Resource resource = new ClassPathResource("config2.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Student std = (Student) factory.getBean("pid1");
		
		std.cry();
	}

}

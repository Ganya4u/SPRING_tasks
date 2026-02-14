package com.ty.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ty.pojo.Aadhar;

@Configuration
@ComponentScan(basePackages = "com.ty.pojo")
public class AppConfig {

	@Bean
	public List<String> getAddress() {
		
				return Arrays.asList("Thane", "Mumbai");
	}

	@Bean(name = "adhaarBean")
	@Scope(value = "prototype")
	public Aadhar getAdhaar() {
		return new Aadhar();
	}

}

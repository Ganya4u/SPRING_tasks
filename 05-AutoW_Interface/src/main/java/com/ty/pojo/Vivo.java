package com.ty.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Vivo implements Mobile {

	@Override
	public void call() {
		System.out.println("Vivo got call");
	}

}
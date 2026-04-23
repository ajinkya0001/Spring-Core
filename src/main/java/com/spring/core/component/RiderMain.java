package com.spring.core.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RiderMain {

	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(Rider.class);
		
//		Rider rider = (Rider) context.getBean("rd");
		Rider rider = (Rider) context.getBean("rider");
		
		rider.ride();
				
	}

}
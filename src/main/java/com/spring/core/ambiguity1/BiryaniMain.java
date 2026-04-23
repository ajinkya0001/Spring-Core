package com.spring.core.ambiguity1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BiryaniMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(PersonBiryaniConfig.class);
		
		Person per = ctx.getBean(Person.class);
		
		per.eatingBiryani();
//		
//		per.eatingBiryani();    //  for component based 
		
		

	}

}

package com.spring.core.di.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HumanConfig.class);
		
		Human human = ctx.getBean(Human.class);
		human.isHeAlive();
	}

}

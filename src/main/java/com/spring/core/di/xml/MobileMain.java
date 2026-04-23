package com.spring.core.di.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Dependency.xml");
		
		Mobile mob = ctx.getBean(Mobile.class);
		mob.playGame();
	}

}

// autowireing;

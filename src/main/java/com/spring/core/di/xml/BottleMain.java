package com.spring.core.di.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BottleMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Dependency.xml");
		Bottle bt = ctx.getBean(Bottle.class);
		bt.drinking();
	}
}

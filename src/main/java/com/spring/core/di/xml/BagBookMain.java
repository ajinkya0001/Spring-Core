package com.spring.core.di.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BagBookMain {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Dependency.xml");
		
		Bag bg = ctx.getBean(Bag.class);
		bg.fillBag();
		
	}

}

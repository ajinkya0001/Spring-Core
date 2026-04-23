package com.spring.core.di.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Dependency.xml");
		
		Person person = ctx.getBean(Person.class);
		person.startDay();
		
		Mobile mob = ctx.getBean(Mobile.class);
		mob.playGame();
	}

}

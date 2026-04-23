package com.spring.core.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		BeanFactory factory = new ClassPathXmlApplicationContext("Beans.xml"); //  giving configuration file to container;
		
		Message message =(Message) factory.getBean("msg");   // by name or id 
		
		message.sendMessage();
		
		Message message1 = factory.getBean(Message.class);  //  by type.
		
		message1.sendMessage();
		
		Person p = factory.getBean(Person.class);
		
		System.out.println(p);
		
		Bike b1 = factory.getBean(Bike.class);
		System.out.println(b1);
		
		Laptop l1 = factory.getBean(Laptop.class);
//		l1.lapType();
		
		System.out.println(l1);
		
		
//		Laptop l2 = factory.getBean(Laptop.class);
//		System.out.println(l2);
	}

}

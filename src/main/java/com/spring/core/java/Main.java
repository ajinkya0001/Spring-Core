package com.spring.core.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SingerConfig.class);
		
		Singer singer = (Singer) ctx.getBean(Singer.class);
		singer.sing();
		Singer singer1 = (Singer) ctx.getBean("singer");
		singer1.sing();

	}

}


/*
 * 
 * */
 
package com.spring.core.di.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class CarMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CarConfig.class);
		
		Car car = ctx.getBean(Car.class);
		
		car.moveCar();

	}

}


/*
 * @Componentscanning
 * 
 * COMPONENT SCANNING : mechanism which will scan the particular components and give to the ...
 * 
 * IT WILL SCAN PROJECT (PPACKAGE), TO CREATE AND CONFIGURE BEANS AND CHECKS THE CLASSES
 * WHICH IS ANNOTATED WITH @Component, @
 * 
 * 
 * we make use of it bcoz if we use only @Component then we only use one class not both car and engine 
 * for scanning the both classes we need to make use of @Componentscan annotation
 * 
 * 
 * @Configuration
@ComponentScan(basePackages="com.spring.core.di.component")

 * */
 
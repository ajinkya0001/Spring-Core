package com.spring.core.di.java;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
//	@Autowired          // field based DI
	Heart heart;
	
	
//	@Autowired            // Constructor Based DI
//	public Human(Heart heart) {
//		this.heart = heart;
//	}
	
	
	// Setter and getter
	
	
	
	public Heart getHeart() {
		return heart;
	}
	
	@Autowired    // Setter based..
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	
	void isHeAlive() {
		heart.pump();
		System.out.println("He is Alive ");
	}


	
	
	
	
}


// Autowiring 

/*
 * AUTOWIRING  : Injecting The dependency Automatically using @Autowired Annotation
 * 
 * NO constructors and no setter and getter
 * 
 *  just by using @Autowired annotation
 *  
 *  Since Spring 4.3 Version @Autowired is not mandatory is your class is having only one constructor
 *  
 *  if we have more than one constructor this will not work without using autowired Annotation
 *  
 * 
 * */
 
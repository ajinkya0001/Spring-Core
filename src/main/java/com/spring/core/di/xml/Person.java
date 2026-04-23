package com.spring.core.di.xml;

public class Person {
	
	Coffee coffee;
	
	
	
	public Coffee getCoffee() {
		return coffee;
	}



	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}



	void startDay() {
		System.out.println("Woke up in the morning");
		coffee.drinkCoffee();
		System.out.println("Started a day..");
	}

}

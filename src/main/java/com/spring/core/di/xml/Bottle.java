package com.spring.core.di.xml;

public class Bottle {
	
	Water water;
	public Bottle(Water water) {
		this.water = water;
	}
	
	public void drinking() {
		System.out.println("Bottle is Empty");
		water.waterfill();
		System.out.println("Now U can drinnk water!!");
	}

}

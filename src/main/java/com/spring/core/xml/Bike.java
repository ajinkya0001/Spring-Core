package com.spring.core.xml;

public class Bike {
	String bikeName;
	String brand;
	int cc;
	public Bike(String bname, String brand, int cc) {
		this.bikeName = bname;
		this.brand = brand;
		this.cc =  cc;
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return bikeName + " " + brand + " " + cc; 
//	}
	@Override
	public String toString() {
		return "Bike [bikeName=" + bikeName + ", brand=" + brand + ", cc=" + cc + "]";
	}
	
	
}

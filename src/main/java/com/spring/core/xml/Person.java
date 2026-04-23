package com.spring.core.xml;

public class Person {
	String pname;
	int age;
	String city;
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getPname() {
		return pname;
	}
	public String getCity() {
		return city;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return pname + " " + age + " " + city;
	}
	
}

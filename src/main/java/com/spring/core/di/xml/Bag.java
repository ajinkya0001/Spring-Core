package com.spring.core.di.xml;

public class Bag {
	
	Books book;
	public Bag(Books book) {
		this.book = book;
	}
	
	public void fillBag() {
		System.out.println("Open the bag");
		book.putBooks();
		System.out.println("Close the Bag");
		
	}

}

package com.tns.dayeight.functionalinterfaces;

public class GreetImplOne implements GreetInterface {

	@Override
	public void greet(String name) {
		System.out.println("Welcome "+name);
		
	}

}

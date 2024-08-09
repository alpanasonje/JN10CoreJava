package com.tns.dayeight.functionalinterfaces;

public class GreetImpl implements GreetInterface{

	@Override
	public void greet(String name) {
		System.out.println("Hello "+name);
		
	}

}

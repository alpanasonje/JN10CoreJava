package com.tns.dayseven;

public class MyChild extends MyBase{
	public void show() {
		System.out.println("show()in MyChild- non-final method");

	}

	// final method cannot overridden
	public void display() {
		System.out.println("display() in MyChild - final method");
	}

}

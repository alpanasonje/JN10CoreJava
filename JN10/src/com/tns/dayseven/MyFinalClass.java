package com.tns.dayseven;

public final class MyFinalClass {
	public MyFinalClass() {
		System.out.println("This is final class");
	}
}

//final class cannot be subclassed (not inherited)
class Child extends MyFinalClass
{
	
}

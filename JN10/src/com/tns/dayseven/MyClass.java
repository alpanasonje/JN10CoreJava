package com.tns.dayseven;

public class MyClass {
	int instanceNo;
	static final int STATIC_CONSTANT=100; //initialize at the time of declaration or in static block
	final int nonStaticConstant;//=1000; //initialize at the time of declaration or in constructor
	static int staticNo;
	
	static {
		staticNo=50;
		//STATIC_CONSTANT=100;
	}
	public MyClass()
	{
		instanceNo=1;	
		nonStaticConstant=5000;
	}
	public MyClass(int a, int b)
	{
		instanceNo=a;
		nonStaticConstant=b;
	}
	void change()
	{
		//constants cannot be change
		//STATIC_CONSTANT++;
		//nonStaticConstant++;
		instanceNo++;
		staticNo++;
	}
	@Override
	public String toString() {
		return "MyClass [staticNo="+staticNo+", STATIC_CONSTANT="+STATIC_CONSTANT+", instanceNo=" + instanceNo + ", nonStaticConstant=" + nonStaticConstant + "]";
	}
	
}

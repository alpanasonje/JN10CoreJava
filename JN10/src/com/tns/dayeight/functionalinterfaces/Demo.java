package com.tns.dayeight.functionalinterfaces;

public class Demo {

	public static void main(String[] args) {
		//GreetImpl obj=new GreetImpl();
		GreetInterface obj=new GreetImpl();		
		obj.greet("Students");
		
		//GreetImplOne objOne=new GreetImplOne();
		GreetInterface objOne=new GreetImplOne();
		objOne.greet("TNS Students");
		
		System.out.println("-----------------");
		
		obj=name->System.out.println("Hello "+name);
		obj.greet("TNS Students");
		
		obj=name->System.out.println("Welcome "+name);
		obj.greet("TNS Students");
		
	}

}


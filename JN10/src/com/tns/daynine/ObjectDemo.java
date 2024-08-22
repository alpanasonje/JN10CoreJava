package com.tns.daynine;

public class ObjectDemo {
	public static void main(String[] args) {
		Course c1=new Course();
		c1.setName("JFS");
		c1.setFees(25000);
		System.out.println(c1);
		
		Course c2=new Course("Java Backend Developement",2000);
		System.out.println(c2);
		
		Course c3=new Course("JFS",25000);
		System.out.println(c3);
		
		System.out.println(c1==c3);
		System.out.println(c1.equals(c3));
	}
}

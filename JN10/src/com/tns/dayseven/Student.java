//Program to define student class
package com.tns.dayseven;

public class Student {
	private int rollNo;
	private String name;
	private float per;
	static String ST;
	static String TT;
	static
	{
		ST="Divya";
		TT="Alpana";
		System.out.println("Static Block");
	}
	
	public Student() {
		System.out.println("Default Constructor");
	}
	
	public Student(int rollNo, String name, float per)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.per=per;
		System.out.println("Parameterized Constructor");
	}

	public static void change()
	{
		ST="Divya Kalarical";
		TT="Alpana Sonje";
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", per=" + per + ", Softskill Trainer="+ST+", Technical Trainer="+TT+"]";
	}
	
	
	
	
}

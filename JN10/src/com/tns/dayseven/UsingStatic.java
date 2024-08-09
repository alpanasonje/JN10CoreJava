package com.tns.dayseven;

public class UsingStatic {
	int no=1; //instance variable
	static int staticNo=100; //static variable
	
	static {
		staticNo++;
		//non static members can not accessible within static context
		//no++;
		//this can not accessible within static context
		//this.no=5; 
		//super.toString();
		//super can not accessible within static context
	}
	public UsingStatic(){	
	}
	public UsingStatic(int no)
	{
		this.no=no;
	}
	//instance method (non-static method)
	void display()
	{
		System.out.println("----display() - Non static method------");
		System.out.println("Static Variable "+staticNo);
		System.out.println("Instance Variable "+no);
	}
	static void show()
	{
		System.out.println("----show() - static method------");
		System.out.println("Static Variable "+staticNo);
		//non static members can not accessible within static context
		//System.out.println("Instance Variable "+no);
	}
}

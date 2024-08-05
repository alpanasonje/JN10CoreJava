//Program to define child class of MyClass defined in another package
package com.tns.dayfour.packages;

import com.tns.dayfour.MyClass;

public class MyClassChild extends MyClass{
	public MyClassChild()
	{
		//protected members are accessible within the child class definition
		protectedNo++;
	}
	void change()
	{
		protectedNo++;
	}
	public static void main(String[] args) {
		MyClassChild obj;
		obj=new MyClassChild(); //call default constructor and initialize data members
		System.out.println(obj); //call toString() method of MyClass
		obj.change();
		//Modify value of data members of MyClass
		//obj.privateNo++;; //private members cannot be accessible outside the class
		//obj.protectedNo++; //protected members cannot be accessible outside the package using object
		//obj.defaultNo++; //default members cannot be accessible outside the package
		obj.publicNo++;
		
		System.out.println(obj); //call toString() method of MyClass


	}

}

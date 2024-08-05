//Program to demonstrate access modifiers
package com.tns.dayfour;

public class MyClassDemo {

	public static void main(String[] args) {
		MyClass obj;
		obj=new MyClass(); //call default constructor and initialize data members
		System.out.println(obj); //call toString() method of MyClass
		
		//Modify value of data members of MyClass
		//obj.privateNo++;; //private members cannot be accessible outside the class
		obj.protectedNo++;
		obj.defaultNo++;
		obj.publicNo++;
		
		System.out.println(obj); //call toString() method of MyClass

	}

}

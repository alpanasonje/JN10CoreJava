//Program to demonstrate access modifiers
package com.tns.dayfour.packages;

import com.tns.dayfour.MyClass;

public class Demo {

	public static void main(String[] args) {
		MyClass obj;
		obj=new MyClass(); //call default constructor and initialize data members
		System.out.println(obj); //call toString() method of MyClass
		
		//Modify value of data members of MyClass
		//obj.privateNo++;; //private members cannot be accessible outside the class
		//obj.protectedNo++; //protected members cannot be accessible outside the package non-subclass
		//obj.defaultNo++; //default members cannot be accessible outside the package
		obj.publicNo++;
		
		System.out.println(obj); //call toString() method of MyClass


	}

}

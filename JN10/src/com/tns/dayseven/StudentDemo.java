//Program to demonstrate student object
package com.tns.dayseven;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student(1, "Sonali",78);
		Student s2=new Student();
		System.out.println(s1);
		System.out.println(s2);
		Student.change();
		System.out.println(s1);
		System.out.println(s2);
	}

}

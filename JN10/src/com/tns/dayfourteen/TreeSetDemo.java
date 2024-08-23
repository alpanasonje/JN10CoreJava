package com.tns.dayfourteen;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		//Sorted Set
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Nashik");
		ts.add("Mumbai");
		ts.add("Bangalore");
		ts.add("Hyderabad");
		ts.add("Chennai");
		ts.add("Nashik");
		System.out.println("Set "+ts);
		
		//Adding User Defined Objects
		Comparator<Employee> comp=(e2, e1)-> e1.getName().compareTo(e2.getName());
	
		//(int)(e1.getSalary()-e2.getSalary());
		
		TreeSet<Employee> empSet=new TreeSet<Employee>(comp);
		empSet.add(new Employee(101, "Amol", 69000, "Sales"));
		empSet.add(new Employee(104, "Nikhil", 69000, "Sales"));
		empSet.add(new Employee(102, "Ketan", 91000, "IT"));
		empSet.add(new Employee(108, "Mahesh", 82000, "HR"));
		empSet.add(new Employee(103, "Ritesh", 56000, "Account"));
		System.out.println("Employee Details");
		System.out.println(empSet);
		
		
	}
}

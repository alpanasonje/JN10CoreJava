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
		ts.add("Nashik");
		ts.add("Hyderabad");
		ts.add("Chennai");
		
		System.out.println("Set "+ts);
		
		//Adding User Defined Objects
		Comparator<Employee> comp=(Employee e2, Employee e1)-> {
				return e1.getName().compareTo(e2.getName());
			};
			
			comp=(e1,e2)-> e1.getId()-e2.getId();
			
	
		comp=(e1, e2)->(int)(e1.getSalary()-e2.getSalary());
		
		comp=(e1,e2) -> e1.getDept().compareTo(e2.getDept());
		
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

package com.tns.daythree;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee e1=new Employee(101, "Pooja", 67000);
		Employee e2=new Employee(102,"Nikita", 81000);
		Employee e3=new Employee();
		e3.setEmpId(103);
		e3.setName("Rahul");
		e3.setSalary(56000);
		
		System.out.println(e1.toString());
		System.out.println(e2); //invoked toString() method
		System.out.println(e3);
		//Object
	}

}

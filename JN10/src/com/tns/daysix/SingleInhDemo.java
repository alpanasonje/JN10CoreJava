package com.tns.daysix;

public class SingleInhDemo {

	public static void main(String[] args) {
		Person p=new Person("Mahesh","Nashik");
		
		Employee e=new Employee(101, 45000, "Account", "Pranav", "Pune");
		System.out.println(p);
		System.out.println(e);
		
		Employee e1=new Employee();
		e1.setName("Arnav");
		e1.setCity("Mumbai");
		e1.setEmpId(102);
		e1.setSalary(54000);
		e1.setDept("IT");
		System.out.println(e1);
		

	}

}

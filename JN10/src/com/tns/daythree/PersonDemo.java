package com.tns.daythree;

public class PersonDemo {

	public static void main(String[] args) {
		Person p=new Person(); 
		p.show();
		System.out.println("--------------------");
		Person p1=new Person("Aniket", "Pune", 23, 76878788900L);
		p1.show();
		p1.setCity("Mumbai");
		p1.show();
	}
}

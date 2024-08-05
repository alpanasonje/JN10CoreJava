package com.tns.daysix;

public class MultilevelInhDemo {

	public static void main(String[] args) {
		String[] projects={"JPM","EXL","Salesforce"};
		Manager m=new Manager(11, 88000, "IT","Neeta", "Mumbai", projects,11);
		System.out.println(m);

	}

}

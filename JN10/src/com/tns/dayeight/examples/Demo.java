package com.tns.dayeight.examples;

public class Demo {
public static void main(String[] args) {
	Account a=new Account("Saving", 11101, "Amit", 50000);
	System.out.println(a);
	a.deposit(12000);
	System.out.println(a);
	a.deposit(40000);
	System.out.println(a);
	a.withdraw(5000);
	System.out.println(a);
	a.withdraw(70000);
	System.out.println(a);
}
}

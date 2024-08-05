package com.tns.dayfive;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String name;
		int no;
		float per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your roll no. : ");
		no=sc.nextInt();
		System.out.println("Enter your name : ");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter your percentage : ");
		per=sc.nextFloat();
		System.out.println("Student Details");
		System.out.println("rollNo : "+no);
		System.out.println("Name : "+name);
		System.out.println("Percentage : "+per);
		
		
		

	}

}

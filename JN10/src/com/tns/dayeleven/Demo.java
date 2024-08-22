package com.tns.dayeleven;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int a, b, c;
		System.out.println("Enter two numbers : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println("Division is "+c);
		System.out.println("-----------------------");
	}
}

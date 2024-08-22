package com.tns.dayeleven;

import java.util.Scanner;

public class UsingThrow {
	public static void divide(int a, int b) {
		int c;
		if (b == 0)
			throw new ArithmeticException();
		else
			c = a / b;
		System.out.println("Division is " + c);
	}

	public static void main(String[] args) {
		int a, b;
		try {
			System.out.println("Enter two numbers : ");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			divide(a,b);
		} catch (ArithmeticException e) {
			System.out.println("Error.. " + e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("-----------------------");
	}
}

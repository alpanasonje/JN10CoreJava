package com.tns.dayeleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
	public static void main(String[] args) {
		int a, b, c;
		try {
			System.out.println("Enter two numbers : ");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println("Division is " + c);

		}
		/*
		 * catch(ArithmeticException e) { System.out.println("Error.. "+e); }
		 * catch(InputMismatchException e) { System.out.println("Invalid input.. "+e); }
		 */
		catch (ArithmeticException | InputMismatchException e) {
			System.out.println("Error.. " + e);
		}
		System.out.println("-----------------------");
	}
}

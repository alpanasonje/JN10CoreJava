package com.tns.dayeleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingFinally {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc;
		try {
			System.out.println("Enter two numbers : ");
			sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println("Division is " + c);
			//System.exit(0);
		} catch (ArithmeticException | InputMismatchException e) {
			System.out.println("Error.. " + e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("-----------------------");
		}

	}

}

package com.tns.dayeleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDemo {
	public static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
	}

	public static void readArray(int a[], Scanner sc) {
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
	}

	public static void main(String[] args) {
		int a[], n;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of array : ");
			n = sc.nextInt();
			a = new int[n];
			readArray(a, sc);
			printArray(a);
			System.out.println("Element at 5 location is : " + a[5]);
		}
		/*
		 * catch(Exception e) { System.out.println("Error Occurred.... "+e); }
		 */

		catch (ArithmeticException | InputMismatchException /* | Exception */ e) {
			System.out.println("Error.. " + e);
		} catch (Exception e) {
			System.out.println("Error Occurred.... " + e);
		}
		System.out.println("-----------------------");

	}

}

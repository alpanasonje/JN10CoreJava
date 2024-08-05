package com.tns.dayone;

import java.util.Scanner;
import com.tns.daythree.*;

public class Demo {
	static int getFactorial(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
			f=f*i;
		return f;
	}
	static void addition(int a, int b)
	{
		int c=a+b;
		System.out.println("addition is "+c);
	}
	public static void main(String args[]) {
		int a,b,c;
		//a=10;
		//b=50;
		addition(10,50);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b ");
		a=sc.nextInt();
		b=sc.nextInt();
		addition(a,b);
		System.out.println("Enter number ");
		a=sc.nextInt();
		b=getFactorial(a);
		System.out.println("factorial is "+b);
		/*
		 * c=a+b; System.out.println(c); System.out.println("Addition is "+c);
		 * System.out.println("Addition of "+a+" and "+b+" is "+c);
		 */
		
		
	}

}

package com.tns.daytwelve;

//single thread application
public class Demo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		System.out.println(Operations.getFactorial(5));
		System.out.println(Operations.checkPalindrome(132));

	}

}

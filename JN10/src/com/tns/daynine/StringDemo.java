package com.tns.daynine;

public class StringDemo {

	public static void main(String[] args) {
		String s="Hello";
		String s1=new String("Hi");
		String s2="Hello";
		String s3=new String("Hello");
		String s4=new String("Hello");
		String s5="hello";
		System.out.println("s==s1? "+(s==s1));
		System.out.println("s.equals(s1)? "+s.equals(s1));
		System.out.println("s==s2? "+(s==s2));
		System.out.println("s.equals(s2)? "+s.equals(s2));
		System.out.println("s==s3? "+(s==s3));
		System.out.println("s.equals(s3)? "+s.equals(s3));
		System.out.println("s==s5? "+(s==s5));
		System.out.println("s.equals(s5)? "+s.equals(s5));
		System.out.println("s3==s4? "+(s3==s4));
		System.out.println("s3.equals(s4)? "+s3.equals(s4));
		s+=" How are you?";
		System.out.println("s==s2? "+(s==s2));
		System.out.println("s.equals(s2)? "+s.equals(s2));
		
		
	}

}

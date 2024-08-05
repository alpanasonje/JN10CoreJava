package com.tns.dayfive;

public class PointDemo {

	public static void main(String[] args) {
		Point p1=new Point();
		Point p2=new Point(2.5f);
		Point p3=new Point(2.5f, 4.0f);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		p1.increment();
		System.out.println(p1);
	}

}

package com.tns.dayfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest {

	public static void main(String[] args) throws IOException {
		String name;
		int no;
		float per;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your roll no. : ");
		no=Integer.parseInt(br.readLine());
		System.out.println("Enter your name : ");
		name=br.readLine();
		System.out.println("Enter your percentage : ");
		per=Float.parseFloat(br.readLine());
		System.out.println("Student Details");
		System.out.println("rollNo : "+no);
		System.out.println("Name : "+name);
		System.out.println("Percentage : "+per);
		

	}

}

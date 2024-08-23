package com.tns.dayfourteen;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numList=new ArrayList<Integer>();
		numList.add(10);
		numList.add(20);
		numList.add(130);
		numList.add(410);
		numList.add(2);
		numList.add(5);
		System.out.println(numList);
		System.out.println("Length : "+numList.size());
		numList.add(2, 100);
	//	numList.add(10.34f);
		System.out.println(numList);
		System.out.println("Length : "+numList.size());
		System.out.println("Index of 130 : "+numList.indexOf(130));
		System.out.println("Value at 2 position : "+numList.get(2));
		System.out.println("Element removed at 2 position : "+numList.remove(2));
		System.out.println(numList);
		System.out.println("Removed 2 value : "+numList.remove(numList.indexOf(2)));
		//IndexOutOfBoundsException
		/*
		 * System.out.println(numList);System.out.println("Removed element 130 "+numList
		 * .remove(130)); System.out.println(numList);
		 */
		
		Collections.sort(numList);
		System.out.println(numList);
		
		//Iterate a collection
		numList.forEach(System.out::println);
		System.out.println("--------------");
		
		Iterator<Integer> i=numList.iterator();
		while(i.hasNext())
		{
			int n=i.next();
			System.out.println(n+" : "+n*n);
			i.remove();
		}
		System.out.println(numList);
		System.out.println("--------------");
		numList.clear();
		System.out.println(numList);
		
		ArrayList<String> courseList=new ArrayList<String>();
		courseList.add("C");
		courseList.add("Java");
		courseList.add("React");
		
		courseList.add("Python");
		courseList.add("C#");
		courseList.add("C++");
	//	courseList.add(12);
		System.out.println(courseList);
		System.out.println(courseList.remove(2)); //removes element at 2
		System.out.println(courseList.remove("C#")); //removes C#
		System.out.println(courseList.remove("VB")); //return false 
		System.out.println(courseList);
		Collections.sort(courseList);
		System.out.println(courseList);
	}

	
}




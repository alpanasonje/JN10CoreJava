package com.tns.dayfourteen;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		//unordered and unsorted set
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(50);
		hs.add(90);
		hs.add(20);
		hs.add(70);
		hs.add(10);
		System.out.println(hs);
		hs.remove(10);
		System.out.println(hs);
		HashSet<Integer> hs1=new HashSet<Integer>();
		hs1.add(11);
		hs1.add(51);
		hs1.add(91);
		hs1.add(20);
		hs1.add(70);
		hs1.add(10);
		System.out.println("First Set "+hs);
		System.out.println("Second Set "+hs1);
		hs.addAll(hs1); //Union of two sets
		System.out.println("First Set "+hs);
		hs.clear();
		hs.add(10);
		hs.add(50);
		hs.add(90);
		hs.add(20);
		hs.add(70);
		System.out.println("First Set "+hs);
		System.out.println("Second Set "+hs1);
		hs.retainAll(hs1); //Intersection of two sets
		System.out.println("First Set "+hs);
		hs.clear();
		hs.add(10);
		hs.add(50);
		hs.add(90);
		hs.add(20);
		hs.add(70);
		System.out.println("First Set "+hs);
		System.out.println("Second Set "+hs1);
		hs.removeAll(hs1); //Set Difference 
		System.out.println("First Set "+hs);
		System.out.println("Second Set "+hs1);
		
		
		

	}

}

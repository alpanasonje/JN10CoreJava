package com.tns.dayfourteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//Ordered and unsorted set
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Nashik");
		lhs.add("Mumbai");
		lhs.add("Bangalore");
		lhs.add("Hyderabad");
		lhs.add("Chennai");
		lhs.add("Nashik");
		System.out.println("Set "+lhs);
		List<String> l=new ArrayList<String>(lhs);
		Collections.sort(l);
		

	}

}

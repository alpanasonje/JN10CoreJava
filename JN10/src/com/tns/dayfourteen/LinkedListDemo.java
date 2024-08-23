package com.tns.dayfourteen;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> nameList=new LinkedList<String>();
		nameList.add("Mohit");
		nameList.add("Sumit");
		nameList.add("Amit");
		nameList.add("Ankit");
		nameList.add("Pratik");
		nameList.add("Mohan");
		System.out.println(nameList);
		nameList.addFirst("Pankaj");
		nameList.addLast("Suraj");
		System.out.println(nameList);
		System.out.println("First Element : "+nameList.getFirst());
		System.out.println("Last Element : "+nameList.getLast());
		System.out.println(nameList.remove(2) +" removed");
		System.out.println("Is Pratik removed? "+nameList.remove("Pratik"));
		System.out.println("Removes first :  "+nameList.removeFirst());
		System.out.println("Removes last :  "+nameList.removeLast());
		
		ListIterator<String> lit=nameList.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		System.out.println("-------------");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		System.out.println("------------");
		lit=nameList.listIterator(2);
		while(lit.hasNext())
		{
			String s=lit.next();
			System.out.println(s);
			if (s.equals("Mohan"))
				lit.remove();
			if (s.equals("Ankit"))
				lit.set("Ankita");
			if (s.equals("Ankit"))
				lit.add("Neha");
			
		}
		System.out.println("-------------------");
		System.out.println(nameList);
	}

}

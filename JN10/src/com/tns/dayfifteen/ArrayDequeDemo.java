package com.tns.dayfifteen;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> aDeQueue=new ArrayDeque<Integer>();
		aDeQueue.add(50);
		aDeQueue.add(90);
		aDeQueue.add(20);
		aDeQueue.add(150);
		aDeQueue.add(70);
		aDeQueue.addFirst(1000);
		System.out.println(aDeQueue);
		System.out.println("Remove from rear end "+aDeQueue.removeLast());
		while(!aDeQueue.isEmpty())
		{
			System.out.println("Elements Removed : "+aDeQueue.poll());
		}
		

	}

}

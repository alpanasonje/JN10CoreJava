package com.tns.dayfifteen;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pQueue=new PriorityQueue<Integer>();
		pQueue.add(50);
		pQueue.add(90);
		pQueue.add(20);
		pQueue.add(150);
		pQueue.add(70);
		System.out.println(pQueue);
		
		while(!pQueue.isEmpty())
		{
			System.out.println("Elements Removed : "+pQueue.poll());
		}
		System.out.println("Elements Removed : "+pQueue.poll());
		//System.out.println("Elements Removed : "+pQueue.remove());
		Comparator<Integer> comp=(n1,n2)->n2-n1;
		pQueue=new PriorityQueue<Integer>(comp);
		pQueue.add(50);
		pQueue.add(90);
		pQueue.add(20);
		pQueue.add(150);
		pQueue.add(70);
		System.out.println(pQueue);
		
		while(!pQueue.isEmpty())
		{
			System.out.println("Elements Removed : "+pQueue.poll());
		}
		
	}

}

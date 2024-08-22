package com.tns.dayeight.examples.interthreadcommunication;

public class Products{
	static int n;
	boolean flag=true;
	public synchronized void put() throws InterruptedException {
		if (flag)
		{
			n++;
			System.out.println("Product Produced " + n);
			flag=false;
			notify();
		}
		wait();
		
	}

	public synchronized void get() throws InterruptedException
	{
		if(!flag)
		{
			System.out.println("Product Consumed.."+n);
			flag=true;
			notify();
		}
		wait();
	}
}

package com.tns.dayeight.examples;

import com.tns.daytwelve.synchronization.AccountThread;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		Account acc=new Account("Saving", 11111, "Amit", 50000);
		AccountThread t1=new AccountThread(acc);
		AccountThread t2=new AccountThread(acc);
		System.out.println(acc);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("-----------------------");
		System.out.println(acc);

	}

}

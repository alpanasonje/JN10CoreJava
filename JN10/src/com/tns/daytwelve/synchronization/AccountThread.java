package com.tns.daytwelve.synchronization;

import com.tns.dayeight.examples.Account;

public class AccountThread extends Thread {
	Account acc;

	public AccountThread() {
	}

	public AccountThread(Account acc) {
		this.acc = acc;
	}

	public void run() {
	//	synchronized (acc) {
			acc.deposit(12000);
			System.out.println(acc + currentThread().getName());
		//}
	}
}

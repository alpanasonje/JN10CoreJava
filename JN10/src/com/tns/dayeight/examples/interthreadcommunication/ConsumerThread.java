package com.tns.dayeight.examples.interthreadcommunication;

public class ConsumerThread extends Thread {
	Products p;

	public ConsumerThread(Products p) {
		this.p = p;
	}

	public void run() {
		while (true) {
			
				try {
					p.get();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
}

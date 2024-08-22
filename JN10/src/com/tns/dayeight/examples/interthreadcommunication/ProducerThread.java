package com.tns.dayeight.examples.interthreadcommunication;

public class ProducerThread extends Thread {
	Products p;

	public ProducerThread(Products p) {
		this.p = p;
	}

	public void run() {
		while (true) {
			try {
				p.put();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

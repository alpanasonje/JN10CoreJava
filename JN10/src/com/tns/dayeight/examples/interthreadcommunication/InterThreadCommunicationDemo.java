package com.tns.dayeight.examples.interthreadcommunication;

public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		Products p=new Products();
		ProducerThread t1=new ProducerThread(p);
		ConsumerThread t2=new ConsumerThread(p);
		t1.start();
		t2.start();

	}

}

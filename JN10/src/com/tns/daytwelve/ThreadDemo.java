package com.tns.daytwelve;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("-------Main Starts------------"+Thread.currentThread().getName());
		WorkerThread t1=new WorkerThread("Worker1"); //child thread
		WorkerThread t2=new WorkerThread(); //child thread
		t1.setPriority(3);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start(); //starting the thread calls run()
		//t2.setName("Worker2");
		t2.start(); //starting the thread
		//t1.run(); //calling manually
		//t2.run();
		//t1.start(); RTE
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-----Main Ends----"+Thread.currentThread().getName());
	}

}

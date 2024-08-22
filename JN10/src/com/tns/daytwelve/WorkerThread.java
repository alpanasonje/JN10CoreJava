package com.tns.daytwelve;

public class WorkerThread extends Thread{
	public WorkerThread()
	{}
	public WorkerThread(String name)
	{
		super.setName(name);
		//start();
	}
	public void run() //task
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello "+currentThread().getName());
			try {
				sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

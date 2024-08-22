package com.tns.daytwelve;

public class RunnableImpl implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=20;i+=2)
		{
			System.out.println(i+"\t"+Thread.currentThread().getName());
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}

}

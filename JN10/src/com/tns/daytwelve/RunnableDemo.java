package com.tns.daytwelve;

public class RunnableDemo {

	public static void main(String[] args) {
		RunnableImpl obj=new RunnableImpl();
		Thread t=new Thread(obj);
		t.start();
		
		//OR no need to create RunnanleImpl class
		
		Runnable r=()->{
			for(int i=2;i<=20;i+=2)
			{
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i+"\t"+Thread.currentThread().getName());
			}
		};
		Thread t1=new Thread(r);
		t1.start();
				
		Thread t2=new Thread(r);
		t2.start();
		
	}

}

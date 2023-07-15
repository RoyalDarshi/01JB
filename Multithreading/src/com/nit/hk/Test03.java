package com.nit.hk;

class MyThread1 extends Exception implements Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run method executed");
	}
}

class CreateThread {
	void execute(Runnable target) {
		Thread th=new Thread(target);
		th.start();
	}
}

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateThread thread=new CreateThread();
		MyThread1 m1=new MyThread1();
		thread.execute(m1);
	}

}

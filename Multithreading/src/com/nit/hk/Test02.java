package com.nit.hk;

class MyThread implements Runnable {
	@Override
	public void run() {
		System.out.println("Run method executed");
	}
}

public class Test02 {

	public static void main(String[] args) {

		System.out.println("Main start");
		MyThread1 my = new MyThread1();
		Thread th = new Thread(my);
		th.start();
		System.out.println("Main end");
	}

}

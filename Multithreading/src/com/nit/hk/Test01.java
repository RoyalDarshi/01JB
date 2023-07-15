package com.nit.hk;

public class Test01 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method executed from " + getName() + " thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");

		Test01 ts = new Test01();
		ts.run();
		ts.start();

		System.out.println("Main end ");
	}

}

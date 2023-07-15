package com.nit.hk;

class PrintNumbers {

	void Number1to50() {

		for (int i = 1; i <= 50; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		} // for

	}// method

	void Number50to1() {

		for (int i = 50; i >= 1; i--) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		} // for

	}// method2

}// class

class MyThread2 extends Thread {
	@Override
	public void run() {

		PrintNumbers number = new PrintNumbers();
		number.Number1to50();
	}
}

class MyThread3 extends Thread {
	@Override
	public void run() {

		PrintNumbers number = new PrintNumbers();
		number.Number50to1();
	}
}

public class Test04 {

	public static void main(String[] args) {

		MyThread2 th = new MyThread2();
		th.start();
		MyThread3 th1 = new MyThread3();
		th1.start();
	}

}

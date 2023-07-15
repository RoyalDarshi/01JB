package com.java.rec;

public class PrintNo_Nto1 {

	public static void printNO(int no) {
		if (no == 0)
			return;
		System.out.println(no);
		printNO(no - 1);
	}

	public static void main(String[] args) {

		printNO(5);
	}

}

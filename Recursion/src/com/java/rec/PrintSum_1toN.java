package com.java.rec;

public class PrintSum_1toN {

	public static int sumofN(int no) {
		if (no == 0)
			return 0;
		return no + sumofN(no - 1);
	}

	public static void main(String[] args) {

		System.out.println(sumofN(10));
	}

}

package com.java.rec;

public class Som_1toN {

	static int printSum(int n) {
		if (n <= 0) {
			return 0;
		}
		int sum = 0;
		sum = n + printSum(n - 1);
		return sum;
	}

	public static void main(String[] args) {

		System.out.println(printSum(5));
	}

}

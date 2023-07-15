package com.java.rec;

public class PrintXpowN_logn {

	public static int calPowlogn(int x, int n) {
		if (n == 0)
			return 1;
		if (x == 0)
			return 0;
		if (n % 2 == 0)
			return calPowlogn(x, n / 2) * calPowlogn(x, n / 2);
		else
			return calPowlogn(x, n / 2) * calPowlogn(x, n / 2) * x;
	}

	public static void main(String[] args) {

		System.out.println(calPowlogn(6, 2));
	}

}

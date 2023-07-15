package com.java.rec;

public class PrintPrimeOneMeth {

	public static void printPrime(int i, int no) {
		if (i >= no) {
			System.out.println(no);
			return;
		}
		if (i < no && no % i == 0)
			return;
		printPrime(i + 1, no);
	}

	public static void main(String[] args) {

		printPrime(2, 11);

	}

}

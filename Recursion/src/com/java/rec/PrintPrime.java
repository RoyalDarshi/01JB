package com.java.rec;

public class PrintPrime {
	
	public static void checkPrime(int i,int no) {
		if(i>=no) {
			System.out.println(no);
			return;
		}
		if(no%i==0) {
			return;
		}
		checkPrime(i+1, no);
	}
	
	public static void printPrime(int i,int n) {
		if(i==n)
			return;
			checkPrime(2, i);
		printPrime(i+1, n);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPrime(1, 50);
		//checkPrime(2, 9);
	}

}

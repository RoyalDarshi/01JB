package com.java.rec;

public class PrintFabbinacciSeq {
	
	public static void printFabbinacci(int a,int b,int no) {		
		if(a==0) {
			System.out.print(a+" "+b+" ");
		}
		if(no<=2)
			return;
		System.out.print(a+b+" ");
		printFabbinacci(b, a+b, no-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFabbinacci(0, 1, 8);
	}

}

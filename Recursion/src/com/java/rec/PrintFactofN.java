package com.java.rec;

public class PrintFactofN {
	
	public static int printFact(int no) {
		if(no==1||no==0) {
			return 1;
		}
		return no*printFact(no-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printFact(5));
	}

}

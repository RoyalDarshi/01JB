package com.java.rec;

public class PrintNo_1toN {
	
	public static void printNO(int no) {
		if(no==0)
			return;		
		printNO(no-1);
		System.out.println(no);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNO(7);
	}

}

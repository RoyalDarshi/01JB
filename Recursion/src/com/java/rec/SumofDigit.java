package com.java.rec;

public class SumofDigit {
	
	public static int  sum(int no) {
		if(no==0)
			return 0;
		return no%10+sum(no/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(348));
	}

}

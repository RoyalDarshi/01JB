package com.java.rec;

public class PrintXpowN {
	
	public static int printXPow(int x,int no) {
		if(no==0) 
			return 1;
		if(x==0)
			return 0;
		return x*printXPow(x, no-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printXPow(5, 0));
	}

}

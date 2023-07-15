package com.nit;

public class Program2 {
	
	public static int getSumOfDigits(int no) {
		if(no<0)
			return -3;
		else if(no>99)
			return -2;
		else if(no>=0&&no<10)
			return -1;
		int sum=0;
		sum=sum+no%10;
		no=no/10;
		sum=sum+no;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(getSumOfDigits(90));
	}

}

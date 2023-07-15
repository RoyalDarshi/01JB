package com.java.rec;

public class RevNum {
	
	
	public static int rev(int no) {
		return helper(no,0);
	}

	private static int helper(int no, int sum) {
		if(no%10==0)
			return sum;
		sum=sum*10+no%10;
		return helper(no/10, sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rev(2357));
	}

}

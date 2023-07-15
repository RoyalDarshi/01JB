package com.royal.java;

public class CheckPalindrome {
	public static boolean isPalindrome(int nos) {
		System.out.println(nos);
		String no=""+nos;
		System.out.println(no);
		for(int i=0;i<no.length()/2;i++) {
			if(no.charAt(i)!=no.charAt(no.length()-1-i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(10));
	}

}

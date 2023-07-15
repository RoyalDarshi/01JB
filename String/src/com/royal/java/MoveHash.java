package com.royal.java;

public class MoveHash {
	
	public static String moveHash(String str) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==35)
				sb.append(str.charAt(i));
		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=35)
				sb.append(str.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(moveHash("#Learn#c++#"));
	}

}

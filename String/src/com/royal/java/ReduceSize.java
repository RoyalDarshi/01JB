package com.royal.java;

public class ReduceSize {
	
	public static String reduceSize(String str) {
		StringBuilder sb=new StringBuilder();
		int count=1;
		for(int i=0;i<str.length();i++) {
			 if(i<=str.length()-2&&str.charAt(i)==str.charAt(i+1))
				 count++;
			 else {
				 sb.append(str.charAt(i));
				 sb.append(count);
				 count=1;
			 }
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reduceSize("aaabbbcdd"));
	}

}

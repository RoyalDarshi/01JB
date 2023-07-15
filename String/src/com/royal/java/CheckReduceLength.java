package com.royal.java;

import java.util.Scanner;

public class CheckReduceLength {

	public static void main(String[] args) {
		System.out.println("Enter First String: ");
		try (Scanner scn = new Scanner(System.in)) {
			String s1=scn.next();
			System.out.println("Enter Sorted String: ");
			String s2=scn.next();
			int i=0;
			if(s1.charAt(i)==s2.charAt(i)) {
				for(i=1;i<s2.length();i++) {
					if(s2.charAt(i)>=48&&s2.charAt(i)<=57) {
						
					}
					else {
						System.out.println("False");
					}
				}
			}//if
			else {
				System.out.println("False");
			}
		}
	}

}

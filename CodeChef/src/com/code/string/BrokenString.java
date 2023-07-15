package com.code.string;

import java.util.Scanner;

public class BrokenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String str="";
		int no=0;
		while(t-->0) {
			no=sc.nextInt();
			sc.nextLine();
			str=sc.nextLine();
			for(int i=0;i<no/2;i++) {
				if(str.charAt(i)!=str.charAt(i+no/2)) {
					System.out.println("NO");
					break;
				}
				if(i==no/2-1)
					System.out.println("YES");
			}
		}
		sc.close();
	}//main

}//class

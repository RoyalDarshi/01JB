package com.code.chef;

import java.util.Scanner;

public class Program08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int x=0,n=0;
		int price=0;
		while (t-->0) {
			n=sc.nextInt();
			x=sc.nextInt();
			price=(n/3*2+n%3)*x;
			System.out.println(price);
		}//while
		sc.close();
	}
}

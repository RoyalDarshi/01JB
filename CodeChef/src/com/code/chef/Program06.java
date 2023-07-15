package com.code.chef;

import java.util.Scanner;

public class Program06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int upper=0;
		while (t-->0) {
			upper=sc.nextInt();
			System.out.println(7-upper);
		}//while
		sc.close();
	}
}

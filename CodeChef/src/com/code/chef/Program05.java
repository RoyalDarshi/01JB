package com.code.chef;

import java.util.Scanner;

public class Program05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int credit=0;
		while (t-->0) {
			credit=sc.nextInt();
			if(credit>65)
				System.out.println("OVERLOAD");
			else if(credit<35)
				System.out.println("UNDERLOAD");
			else
				System.out.println("NORMAL");
		}//while
		sc.close();
	}
}

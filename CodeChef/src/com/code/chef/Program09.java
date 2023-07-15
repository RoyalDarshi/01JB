package com.code.chef;

import java.util.Scanner;

public class Program09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int banana=0,apple=0;
		while (t-->0) {
			banana=sc.nextInt();
			apple=sc.nextInt();
			if(banana/2>apple)
				System.out.println(apple);
			else
				System.out.println(banana/2);
		}//while
		sc.close();
	}
}

package com.code.chef;

import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int tyre=0;
		while(t-->0) {
			tyre=sc.nextInt();
			if(tyre%4>0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}//while
		sc.close();
	}

}

package com.code.chef;

import java.util.Scanner;

public class Program07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int x=0,y=0,z=0;
		while (t-->0) {
			x=sc.nextInt();
			y=sc.nextInt();
			z=x-y;
			if(z%2==0) {
				if(z>=0)
					System.out.println(z/2);
				else
					System.out.println(-1*z/2);
			}
			else
				if((x-y)>=0)
					System.out.println((z+1)/2);
				else
					System.out.println(-1*(z-1)/2);
		}//while
		sc.close();
	}
}

package com.code.chef;

import java.util.Scanner;

class Program01
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->=0){
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int k=sc.nextInt();
		    if(m-(n+k)>=0)
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		}
		sc.close();
	}
}

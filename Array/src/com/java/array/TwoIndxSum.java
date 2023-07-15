package com.java.array;

import java.util.Scanner;

public class TwoIndxSum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter size of Array: ");
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter element in Array: ");
			arr[i]=scn.nextInt();
		}
		int sum=0;
		System.out.print("Enter First Index No: ");
		int indx=scn.nextInt();
		sum+=arr[indx];
		System.out.print("Enter Second Index No: ");
		indx=scn.nextInt();
		sum+=arr[indx];
		System.out.println("Sum: "+sum);
	}

}

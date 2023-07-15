package com.java.array;

import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter size of Array: ");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter element in Array: ");
			arr[i]=scn.nextInt();
		}
		boolean k=false;
		System.out.print("Enter sum: ");
		int sum=scn.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i+1;i<n;i++) {
				if(i!=j&&arr[i]+arr[j]==sum) {
					System.out.println("["+i+" "+j+"]");
					k=true;
				}
			}
		}
		if(k==false) {
			System.out.println("No records found...!");
		}
	}
}

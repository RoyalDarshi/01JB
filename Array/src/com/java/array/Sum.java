package com.java.array;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		System.out.print("Enter size of array: ");
		try (Scanner scn = new Scanner(System.in)) {
			int n=scn.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				System.out.print("Enter element in Array: ");
				arr[i]=scn.nextInt();
			}
			int sum=0;
			for(int i=0;i<n;i++) {
				sum+=arr[i];
			}
			System.out.print("Sum of Array: "+sum);
		}
	}

}

package com.java.array;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		System.out.print("Enter size of array: ");
		try (Scanner scn = new Scanner(System.in)) {
			int n=scn.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				System.out.print("Enter element of Array: ");
				arr[i]=scn.nextInt();
			}
			int max=arr[0];
			for(int i=1;i<n;i++) {
				if(max<arr[i]) {
					max=arr[i];
				}
			}
			System.out.print("Maximum Number: "+max);
		}
	}

}

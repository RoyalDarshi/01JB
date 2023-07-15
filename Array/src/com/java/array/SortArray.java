package com.java.array;

import java.util.Scanner;

public class SortArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Enter size of Array: ");
		try (Scanner scn = new Scanner(System.in)) {
			int n=scn.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				System.out.print("Enter element in Array: ");
				arr[i]=scn.nextInt();
			}
			int temp=0;
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(arr[j]<arr[i]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			System.out.println("****Sorted Array****\n\t");
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}

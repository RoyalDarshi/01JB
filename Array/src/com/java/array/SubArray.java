package com.java.array;

import java.util.Scanner;

public class SubArray {
	public static int findSubArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of first array: ");
		int[] arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter size of second array: ");
		int[] brr=new int[sc.nextInt()];
		for(int i=0;i<brr.length;i++)
			brr[i]=sc.nextInt();
		sc.close();		
		int i=0;
		int j=0;
		for(i=0;i<arr.length;i++) {
			for(int k=1;k<arr.length-1;k++) {
				if(arr[j]==arr[j+1])
					j++;					
			}			
			if(arr[i]==brr[j])
				break;
		}
		for(j=1;j<brr.length;j++) {
			if(i+1>=arr.length)
				return arr.length;
			if(brr[j]!=arr[++i])
				return arr.length;
		}
		return arr.length-1;
	}

	public static void main(String[] args) {
		System.out.println(findSubArray());
	}

}

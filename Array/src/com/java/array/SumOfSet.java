package com.java.array;

public class SumOfSet {
	
	public static boolean isSumOfSet(int[] arr,int no) {
		int sum=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==no) {	
					return true;
				}
			}
			for(int j=i;j<arr.length;j++) {
				if(sum+arr[j]==no) {		
					return true;
				}
			}
			sum+=arr[i];
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isSumOfSet(new int[]{1,4,9,3,6},19 ));
	}

}

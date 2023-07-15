package com.java.array;

public class BinarySearch {
	static int[] arr= {0,1,3,4,5,7,8,9,10,23,31,33,45,56,76};
	
	public static boolean search(int item) {
		int mid=arr.length/2;
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			if(arr[mid]==item)
				return true;
			if(arr[start]<arr[mid])
				end=mid;
			else
				start=mid;			
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(search(2));
	}

}

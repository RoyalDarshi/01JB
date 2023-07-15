package com.java.rec;

public class BinarySearch {
	
	public static int search(int start ,int end ,int[] arr,int target) {
		if(start>end)
			return -1;
		int middle=start+(end-start)/2;
		if(arr[middle]==target)
			return middle;
		if(target<arr[middle])
			return search(start, middle-1, arr, target);
		return search(middle+1, end, arr, target);
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,7,9,23,29,65,78,96};
		System.out.println(search(0, 7, arr, 0));
	}

}

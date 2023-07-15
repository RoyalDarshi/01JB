package com.java.array;

public class CountOfNumber {
	
	public static void countNum(int[] arr) {
		int count=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
			}			
		}
		for(int i=0;i<arr.length;i++) {
			if(i+1<=arr.length-2&&arr[i]==arr[i+1])
				count++;
			else {
				System.out.println("Count of "+arr[i]+" is "+count);
				count=1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countNum(new int[]{3,3,1,1,5,6,2,2,3,1});
	}

}

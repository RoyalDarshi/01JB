package com.royal.java;

public class SortedString {
	
	public static String sort(String word) {
		char[] arr=word.toCharArray();
		for(int i=1;i<arr.length;i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[i]) {
					char temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}		
		return new String(arr);
	}

	public static void main(String[] args) {		
		System.out.println(sort("priyadarshi"));
	}

}

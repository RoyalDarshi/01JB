package com.java.rec;

public class Subarray {
	static void printSubArrays(int[] arr, int start, int end)
    {        
        if (end == arr.length)
            return;        
        else if (start > end)
            printSubArrays(arr, 0, end + 1);        
        else {            
            for (int i = start; i < end; i++)
                System.out.print(arr[i] + " ");
            System.out.println(arr[end]);
            printSubArrays(arr, start + 1, end);
        }
        return;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
        printSubArrays(arr, 0, 0);
	}

}
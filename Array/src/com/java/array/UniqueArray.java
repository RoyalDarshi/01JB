package com.java.array;

import java.util.Scanner;

public class UniqueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array: ");
		a=sc.nextInt();
		int[] array=new int[a];
		int[] clone=new int[a];
		for(int i=0;i<a;i++) {
			System.out.println("Enter value for index "+i+" :");
			array[i]=sc.nextInt();
		}
		int count=0;
		int k=0;
		boolean flag=false;
		for(int i=0;i<a;i++) {
			count=0;
			for(int j=0;j<=i;j++) {
				if(flag==false&&array[i]==0) {
					clone[k]=array[i];
					flag=true;
					k++;
				}
					
				if(array[i]==clone[j])
					count++;
			}
			if(count==0) {
				clone[k]=array[i];
				k++;
			}
		}
		System.out.println("Array with unique content");
		System.out.print("[");
		for(int i=0;i<k;i++) {			
			System.out.print(clone[i]);
			if(i<k-1)
				System.out.print(", ");
		}
		System.out.print("]");
		sc.close();
	}

}

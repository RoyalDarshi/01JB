package com.nit.java;

import java.util.ArrayList;
import java.util.Scanner;

public class SteppingNumber {
	
	public static int findStepping() {
		System.out.print("Enter starting no: ");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		System.out.print("Enter kth no: ");
		int k=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<>();
		int i=0;
		for(i=0;i<10;i++)
			al.add(i);
		while(al.size()<=no+k) {	
			int j=i;
			boolean flag=true;
			while(j!=0) {
				flag=true;
				int last=j%10;
				j=j/10;
				int sec=j%10;
				if(last-sec!=0) {
					if(last-sec!=1) {
						if(sec-last!=1) {
							flag=false;
							break;
						}
					}
				}
				if(j/10==0)
					break;
			}
			if(flag)
				al.add(i);
			i++;
		}
		for(i=0;al.get(i)<=no;i++);
		return al.get(i+k-1);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findStepping());
	}

}

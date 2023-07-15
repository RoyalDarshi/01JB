package com.java.math;

public class Factorial {
	
	public static void fact(int no) {
		int j=1;
		for(int i=1;i<=no;i*=i) {
			if(no%j==0) {
				System.out.println(j);
				if(no/j!=j)
				System.out.println(no/j);
			}			
			j++;
			i=j;
		}
	}

	public static void main(String[] args) {
		fact(16);
	}

}

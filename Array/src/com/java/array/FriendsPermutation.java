package com.java.array;

import java.util.Scanner;

public class FriendsPermutation {
	
	public static int permutation() {
		try (Scanner sc = new Scanner(System.in)) {
			int size=sc.nextInt();
			int[] s=new int[size];
			for(int i=0;i<s.length;i++) {
				s[i]=sc.nextInt();
			}
			int[] p=new int[s.length];
			int[] q=new int[p.length];
			for(int i=0;i<p.length;i++)
				p[i]=i+1;
			int k=0;
			for(int i=0;i<p.length;i++)
				q[i]=p[i];
			k++;
			while(true) {
				if(q[0]==s[0])
					return k;
				if(q[0]>s[0])
					return -1;			
				for(int i=0;i<p.length;i++) {
					q[i]+=p[p.length-1];
				}	
				k++;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(permutation());
	}

}

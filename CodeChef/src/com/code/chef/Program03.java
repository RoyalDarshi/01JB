package com.code.chef;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		if(no>=1&&no<=50)
			System.out.println(100);
		else if(no>50&&no<=100)
			System.out.println(50);
		else
			System.out.println(0);
		sc.close();
	}// main

}// class

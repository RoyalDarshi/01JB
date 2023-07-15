package com.code.chef;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String binary = "";
		boolean flag = true;
		while (t-- > 0) {
			flag = true;
			int no = sc.nextInt();
			binary = "";
			for (int i = no; i > 0; i--) {
				if (flag) {
					binary += 1;
					flag = false;
				} else {
					binary += 0;
					if (i == 2)
						flag = true;
				}
			}
			System.out.println(binary);
		} // while_outer
		sc.close();
	}// main

}// class

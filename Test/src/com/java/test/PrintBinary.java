package com.java.test;

import java.util.Scanner;

public class PrintBinary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no: ");
		int no = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		String binary = "";
		if (no == 0)
			binary += 0;
		while (no != 0) {
			sb.append(no % 2);
			no /= 2;
		}
		for (int i = sb.length() - 1; i >= 0; i--)
			binary += sb.charAt(i);
		System.out.println(binary);
		sc.close();
	}

}

package com.java.hackerrank;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			int result = 0;
			for (int i = 1; i <= n; i++) {
				result = a;
				for (int j = 1; j < i; j++) {
					result += Math.pow(2, j) * b;
				}
				System.out.print(result + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}

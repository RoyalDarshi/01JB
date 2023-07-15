package com.java.hackerrank;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String str = "";
		double no = 0.0;
		sc.nextLine();
		while (t-- > 0) {
			str = sc.nextLine();
			no = Double.parseDouble(str);
			System.out.println(no);
			if (no < Long.MIN_VALUE || no > Long.MAX_VALUE) {
				System.out.println(str + " can't be fitted anywhere.");
			} else {
				System.out.println(str + " can be fitted in:");
				if (no >= -128 && no <= 127)
					System.out.println("* byte");
				if (no >= -32768 && no <= 32767)
					System.out.println("* short");
				if (no >= -2147483648 && no <= 2147483647)
					System.out.println("* int");
				if (no >= -9223372036854775808L && no <= 9223372036854775807L)
					System.out.println("* long");
			}
		}
		sc.close();
	}

}

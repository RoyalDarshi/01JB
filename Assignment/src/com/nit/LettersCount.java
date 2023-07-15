package com.nit;

import java.util.Scanner;

public class LettersCount {

	static void letterCount(String name) {

		for (int j = 65; j <= 91; j++) {
			int count = 0;
			for (int i = 0; i < name.length(); i++) {
				if (((int) name.charAt(i)) == j || ((int) name.charAt(i)) == j + 32)
					count++;
			}
			if (count != 0)
				System.out.println("No of " + (char) j + " : " + count);
		}
		System.out.println("Total letter count: " + name.length());
	}

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.print("Enter any name: ");
			String name = scn.next();
			letterCount(name);
		}
	}

}

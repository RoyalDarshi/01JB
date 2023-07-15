package com.java.math;

import java.util.Scanner;

public class VerifyMobileNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mob NO: ");
		long mobNo = sc.nextLong();
		if ((mobNo / 1000000000) >= 6 && (mobNo / 1000000000) <= 9) {
			System.out.println("It's a valid mob no");
		} else {
			System.out.println("It's a not valid mob no");
		}
		sc.close();
	}

}

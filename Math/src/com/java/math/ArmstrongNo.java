package com.java.math;

public class ArmstrongNo {

	public static String checkArmstrong(int no) {
		if (no < 0)
			return "-1";
		if (no <= 999 || no > 9999)
			return "-2";
		int sum = 0;
		int temp = no;
		while (no != 0) {
			sum = sum + ((no % 10) * (no % 10) * (no % 10) * (no % 10));
			no = no / 10;
		}
		if (temp == sum)
			return "Armstrong Number";
		return "Not Armstrong Number";
	}// checkArmstrong()

	public static void main(String[] args) {

		System.out.println(checkArmstrong(1635));
	}

}

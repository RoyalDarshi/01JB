package com.java.array;

public class CheckPassword {

	public static int checkPass(String pass) {
		if (pass.length() < 4)
			return 0;
		boolean flag = true;
		if (pass.charAt(0) >= 48 && pass.charAt(0) <= 57)
			return 0;
		for (int i = 0; i < pass.length(); i++) {
			if (pass.charAt(i) >= 65 && pass.charAt(i) <= 90) {
				flag = true;
				break;
			} else
				flag = false;
		}
		if (flag == false)
			return 0;
		else {
			for (int i = 0; i < pass.length(); i++) {
				if (pass.charAt(i) >= 48 && pass.charAt(i) <= 57) {
					flag = true;
					break;
				} else
					flag = false;
			}
			if (flag == false)
				return 0;
		}
		if (flag == false)
			return 0;
		else {
			for (int i = 0; i < pass.length(); i++) {
				if (pass.charAt(i) == 32 || pass.charAt(i) == '/') {
					flag = false;
					break;
				} else
					flag = true;
			}
			if (flag == false)
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPass("kZ2kgh"));
	}

}

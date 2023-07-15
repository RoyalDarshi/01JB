package com.nit.java;

import java.util.Scanner;

public class FindLCM {

	static int findLCM() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First NO: ");
		int fno = sc.nextInt();
		System.out.print("Enter Second NO: ");
		int sno = sc.nextInt();
		sc.close();
		if (fno == 0)
			return sno;
		if (sno == 0)
			return fno;
		int i = 2;
		int sum = 1;
		boolean flag = true;
		while (i <= Math.max(sno, fno)) {
			if (sno % i == 0 || fno % i == 0) {
				sum *= i;
				flag = true;
				if (sno % i == 0)
					sno /= i;
				if (fno % i == 0)
					fno /= i;
			} else
				flag = false;
			if (flag == false)
				i++;
		}
		return sum;
	}

	public static int lcm() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First NO: ");
		int fno = sc.nextInt();
		System.out.print("Enter Second NO: ");
		int sno = sc.nextInt();
		sc.close();
		if (fno == 0)
			return sno;
		if (sno == 0)
			return fno;
		int i = 2;
		int gcm = 1;
		while (i <= Math.min(sno, fno)) {
			if (fno % i == 0 && sno % i == 0)
				gcm = i;
			i++;
		}
		return (fno * sno) / gcm;
	}

	public static void main(String[] args) {

		System.out.println(lcm());
	}

}

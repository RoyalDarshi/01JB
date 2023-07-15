package com.java.rec;

public class CountZero {

	public static int count(int no) {
		return helper(no, 0);
	}

	private static int helper(int no, int count) {
		if (no == 0)
			return count;
		if (no % 10 == 0)
			return helper(no / 10, count + 1);
		return helper(no / 10, count);
	}

	public static void main(String[] args) {

		System.out.println(count(1000500));
	}

}

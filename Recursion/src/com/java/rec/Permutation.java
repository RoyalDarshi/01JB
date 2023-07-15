package com.java.rec;

import java.util.ArrayList;

public class Permutation {
	static ArrayList<String> al = new ArrayList<>();

	static void perm(String str1, String str2) {
		if (str1.length() == 0) {
			al.add(str2);
		} else {
			for (int i = 0; i < str1.length(); i++) {
				String str3 = new String(str2);
				str3 = str3 + str1.charAt(i);
				String str4 = new String(str1.substring(0, i) + str1.substring(i + 1));
				perm(str4, str3);
			}
			return;
		}
	}

	public static void main(String[] args) {

		perm("abc", "");
		System.out.println(al);
	}

}

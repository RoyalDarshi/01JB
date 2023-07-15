package com.java.rec;

public class TowerofHanoi {

	public static void towerofHanoi(int n, String src, String help, String dest) {
		if (n == 1) {
			System.out.println("Sending disk " + n + " from " + src + " to " + dest);
			return;
		}
		towerofHanoi(n - 1, src, dest, help);
		System.out.println("Sending disk " + n + " from " + src + " to " + dest);
		towerofHanoi(n - 1, help, src, dest);
	}

	public static void main(String[] args) {

		towerofHanoi(3, "S", "H", "D");
	}

}

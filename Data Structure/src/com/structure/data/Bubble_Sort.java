package com.structure.data;

public class Bubble_Sort {

	public void sort(int[] arr) {
		boolean swap = false;
		for (int i = 0; i < arr.length - 1; i++) {
			swap = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
					swap = true;
				}
			} // inner_for
			if (!swap) {
				return;
			}
		} // outer_for
	}// sort

	public void print(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			sb.append(", ");
		}
		sb.delete(sb.lastIndexOf(", "), sb.length());
		sb.append("]");
		System.out.println(sb);
	}// print

	public static void main(String[] args) {

		int[] arr = { 5, 1, 7, 8, 3, 6, 9 };
		Bubble_Sort bs = new Bubble_Sort();
		bs.sort(arr);
		bs.print(arr);
	}// main

}// Bubble_Sort

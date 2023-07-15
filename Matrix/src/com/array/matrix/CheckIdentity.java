package com.array.matrix;

import java.util.Scanner;

public class CheckIdentity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row of matrix: ");
		int row = sc.nextInt();
		System.out.print("Enter column of matrix: ");
		int column = sc.nextInt();
		int[][] matrix = new int[row][column];
		boolean flag = row == column;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("Enter value of row " + i + " column " + j);
				matrix[i][j] = sc.nextInt();
				if (i == j && matrix[i][j] != 1) {
					flag = false;
				}
				if (i != j && matrix[i][j] != 0) {
					flag = false;
				}
			}
		}
		
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					if (j == 0)
						System.out.print("|");
					System.out.print(matrix[i][j] + " ");
					if (j == column - 1)
						System.out.print("|");
				}
				System.out.println();
			}
			if (flag)
				System.out.println("Identity Matrix");
			else
				System.out.println("Not a identity matrix");
		sc.close();
	}

}

package com.array.matrix;

import java.util.Scanner;

public class ProductofMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Matrix Row Count: ");
		int row1 = sc.nextInt();
		System.out.print("Enter First Matrix Column Count: ");
		int column1 = sc.nextInt();
		System.out.print("Enter Second Matrix Row Count: ");
		int row2 = sc.nextInt();
		System.out.print("Enter Second Matrix Column Count: ");
		int column2 = sc.nextInt();
		if(row2==column1) {
			int[][] first = new int[row1][column1];
			int[][] second = new int[row2][column2];
			int[][] product = new int[row1][column2];
			System.out.println("Enter value for first matrix::");
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < column1; j++) {
					System.out.println("Enter value for row " + (i + 1) + " and column " + (j + 1));
					first[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter value for second matrix::");
			for (int i = 0; i < row2; i++) {
				for (int j = 0; j < column2; j++) {
					System.out.println("Enter value for row " + (i + 1) + " and column " + (j + 1));
					second[i][j] = sc.nextInt();
				}
			}
			System.out.println();
			System.out.println("First Matrix");
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < column1; j++) {
					if (j == 0)
						System.out.print("|");
					System.out.print(" " + first[i][j] + " ");
					if (j == column1 - 1)
						System.out.print("|");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("Second Matrix:");
			for (int i = 0; i < row2; i++) {
				for (int j = 0; j < column2; j++) {
					if (j == 0)
						System.out.print("|");
					System.out.print(" " + second[i][j] + " ");
					if (j == column2 - 1)
						System.out.print("|");
				}
				System.out.println();
			}
			int sum = 0;			
			for(int r1=0;r1<row1;r1++) {
				for(int c2=0;c2<column2;c2++){
					sum=0;					
					for(int c1=0;c1<column1;c1++)  {
						sum=sum+first[r1][c1]*second[c1][c2];
					}
					product[r1][c2]=sum;
				}
			}
			System.out.println();
			System.out.println("Product of both matrix");
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < column2; j++) {
					if (j == 0)
						System.out.print("|");
					System.out.print(" " + product[i][j] + " ");
					if(j==column2-1)
						System.out.print("|");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Product is not possible!");
		}
		sc.close();
	}

}

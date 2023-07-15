package com.array.matrix;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Matrix Row Count: ");
		int row=sc.nextInt();
		System.out.print("Enter Matrix Column Count: ");
		int column=sc.nextInt();
		int[][] matrix=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.println("Enter value for row "+(i+1)+" and column "+(j+1));
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(j==0)
					System.out.print("|");
				System.out.print(" "+matrix[i][j]+" ");
				if(j==column-1)
					System.out.print("|");
			}
			System.out.println();
		}
		sc.close();
	}

}

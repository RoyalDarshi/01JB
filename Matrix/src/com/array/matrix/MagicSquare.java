package com.array.matrix;
import java.util.*;

public class MagicSquare {
	
	public static boolean isMagicSquare(int[][] matrix) {
		int magicSum=0;
		for(int i=0;i<matrix.length;i++) {
			magicSum += matrix[0][i];
		}
		int d1Sum=0;		
		for(int i=0;i<matrix.length;i++) {
			int sum=0;
			for(int j=0;j<matrix.length;j++) {
				sum+=matrix[i][j];
				if(i==j)
					d1Sum+=matrix[i][j];
			}
			if(magicSum!=sum)
				return false;
			sum=0;
			for (int[] ints : matrix) {
				sum += ints[i];
			}
			if(magicSum!=sum) {
				return false;
			}
		}
		if(d1Sum!=magicSum)
			return false;
		int d2Sum=0;
		for(int i=0;i<matrix.length;i++) {
			d2Sum+=matrix[i][matrix.length-1-i];
		}
		return d2Sum == magicSum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter matrix row size: ");
		int row=sc.nextInt();
		System.out.print("Enter matrix col size: ");
		int col=sc.nextInt();
		if(row!=col) {
			System.out.println("Magic Square is not Possible!");
			sc.close();
			return;
		}
		int[][] matrix=new int[row][col];	
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				System.out.print("Enter value for ["+i+"]["+j+"]: ");
			}
		}
		sc.close();
		System.out.println(isMagicSquare(matrix));
		//matrix[i][j]=sc.nextInt();
	}

}

package pattern.design;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter column no: ");
		int column=sc.nextInt();
		System.out.print("Enter row no: ");
		int row=sc.nextInt();
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(i==0||i==row-1)
					System.out.print("*");
				if(i>0&&i<row-1) {
					if(j==0||j==column-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}					
			}
			System.out.println();
		}
		sc.close();
	}
	
}

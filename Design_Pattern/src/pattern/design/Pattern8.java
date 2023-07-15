package pattern.design;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no: ");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++) {
			for(int k=1;k<=no-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}

}

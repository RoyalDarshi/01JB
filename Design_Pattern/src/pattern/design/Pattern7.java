package pattern.design;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no: ");
		int no=sc.nextInt();
		for(int i=0;i<no;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(j+65)+" ");
			}
			for(int j=i-1;j>=0;j--) {
				System.out.print((char)(j+65)+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}

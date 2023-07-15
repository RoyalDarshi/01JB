package com.code.chef;

import java.util.Scanner;

/*
  Chef has an exam which will start exactly MM minutes from now. 
  However, instead of preparing for his exam, 
  Chef started watching Season-11 of Superchef. 
  Season-11 has NN episodes, 
  and the duration of each episode is KK minutes.
  Will Chef be able to finish watching Season-11 
  strictly before the exam starts?
 */

public class Program11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int m=0,n=0,k=0;
		while (t-->0) {
			m=sc.nextInt();
			n=sc.nextInt();
			k=sc.nextInt();
			if(m-(n*k)>0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}//while
		sc.close();
	}
}

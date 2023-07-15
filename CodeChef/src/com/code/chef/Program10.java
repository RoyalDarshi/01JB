package com.code.chef;

import java.util.Scanner;

/*
  In a company an employee is paid as under:
  
   If his basic salary is less than Rs. 1500,
   then HRA = 10% of base salary and DA = 90% of basic salary.
   
   If his salary is either equal to or above Rs. 1500,
   then HRA = Rs. 500 and DA = 98% of basic salary.
   
   If the Employee's salary is input, 
   write a program to find his gross salary.
   
   NOTE: Gross Salary = Basic Salary + HRA + DA
 */

public class Program10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int salary=0;
		double totalSal=0.0;
		while (t-->0) {
			salary=sc.nextInt();
			if(salary<1500)
				totalSal=salary*2;
			else
				totalSal=salary+500+salary*98/100.00;
			System.out.println(totalSal);
		}//while
		sc.close();
	}
}

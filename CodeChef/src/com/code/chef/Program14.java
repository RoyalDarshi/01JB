package com.code.chef;

import java.util.Scanner;

/*
  The citizens of Byteland regularly play a game. 
  They have blocks each denoting some integer from 0 to 9. 
  These are arranged together in a random manner without seeing to form different numbers keeping in mind that the first block is never a 0. Once they form a number they read in the reverse order to check if the number and its reverse is the same. If both are same then the player wins. We call such numbers palindrome.

Ash happens to see this game and wants to simulate the same in the computer. As the first step he wants to take an input from the user and check if the number is a palindrome and declare if the user wins or not.  
*/

public class Program14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int ls=0;
		int b=0;
		while(t-->0) {
			b=sc.nextInt();
			ls=sc.nextInt();
			System.out.println(Math.sqrt((double)(ls*ls-b*b))+" "+Math.sqrt((double)(ls*ls+b*b)));
		}//while
		sc.close();
	}
}

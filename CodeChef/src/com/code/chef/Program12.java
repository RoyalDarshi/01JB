package com.code.chef;

import java.util.Scanner;

/*
  People in Chefland have three different eye colors, 
  namely brown, blue, and green. 
  green is the rarest of the eye colors whereas brown is most common.

  The eye color of the child of two people is 
  most likely to be the most common eye color between them.

  You are given two characters denoting the 
  eye colors of two people in Chefland. 
  The character R denotes bRown color, B denotes Blue color, 
  and G denotes Green color.

  Determine the most likely eye color of their child. 
  (Print R, B or G denoting bRown, Blue or Green respectively).
*/

public class Program12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String p1=sc.next();
		String p2=sc.next();
		if(p1.charAt(0)==p2.charAt(0))
			System.out.println(p1.charAt(0));
		else if(p1.charAt(0)=='R'||p2.charAt(0)=='R')
			System.out.println('R');
		else
			System.out.println('B');
		sc.close();
	}
}

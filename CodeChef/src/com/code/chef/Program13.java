package com.code.chef;

import java.util.Scanner;

/*
  Professor Snape has lots of potions. 
  Bottles containing all types of potions are stacked on shelves 
  which cover the entire wall from floor to ceiling. 
  Professor Snape has broken his bones several times 
  while climbing the top shelf for retrieving a potion. 
  He decided to get a ladder for him. 
  But he has no time to visit Diagon Alley. 
  So he instructed Ron Weasley to make a ladder for him. 
  Professor Snape specifically wants a step ladder 
  which looks like an inverted 'V' from side view.
  
  Professor just mentioned two things before vanishing-
  B - separation between left side (LS) and right side (RS) on the ground
  LS - the length of left side
  What should be the length of RS? 
  At one extreme LS can be vertical and at other RS can be vertical. 
*/

public class Program13 {
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

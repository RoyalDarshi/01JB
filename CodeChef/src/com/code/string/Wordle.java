package com.code.string;

import java.util.Scanner;

public class Wordle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of test case: ");
		int t=sc.nextInt();
		String word="";
		String guess="";
		String result="";
		sc.nextLine();
		while (t-->0) {
			System.out.print("Enter hidden word: ");
			word=sc.nextLine();
			System.out.print("Enter guess  word: ");
			guess=sc.nextLine();
			result="";
			for(int i=0;i<word.length();i++) {
				if(word.charAt(i)==guess.charAt(i))
					result+="G";
				else
					result+="B";
			}
			System.out.println(result);
		}
		sc.close();
	}

}

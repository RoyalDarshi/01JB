package com.code.string;

import java.util.Scanner;

public class TheBlockGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String no="",rev="";
		while(t-->0){
		    no=sc.next();
		    if(no.charAt(0)=='0'||no.charAt(no.length()-1)=='0'){
		        System.out.println("Loses");
		        continue;
		    }
		    for(int i=no.length()-1;i>=0;i--){
		        rev+=no.charAt(i);
		    }
		    if(rev.equals(no))
		        System.out.println("Wins");
		    else
		        System.out.println("Loses");
		}		
		sc.close();
	}

}

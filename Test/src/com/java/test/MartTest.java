package com.java.test;

import java.util.Scanner;

public class MartTest {
	
	String[] product=new String[10];
	int[] qty=new int[10];
	int[] price=new int[10];
	Scanner sc=new Scanner(System.in);
	public void mart() {
		// TODO Auto-generated method stub
		System.out.println("=======Welcome to Mart=========");
		System.out.println("Id      Name      Price");
		System.out.println("101     Mango     100");
		System.out.println("102     Orange    120");
		System.out.println("103     Banana    50");
		System.out.println("Enter your choice:: ");
		switch(sc.nextInt()) {
		case 101:
			for(int i=0;i<product.length;i++) {
				if(product[i]==null) {
					product[i]="Mango";
					price[i]=100;
					break;
				}
			}
			break;
		case 102:
			for(int i=0;i<product.length;i++) {
				if(product[i]==null) {
					product[i]="Orange";
					price[i]=120;
					break;
				}
			}
			break;
		case 103:
			for(int i=0;i<product.length;i++) {
				if(product[i]==null) {
					product[i]="Banana";
					price[i]=50;
					break;
				}
			}
			break;
		default:
			System.out.println("Invalid Id");
		}//switch
		System.out.println("Enter qty: ");
	
		for(int i=0;i<qty.length;i++) {
			if(qty[i]==0) {
				qty[i]=sc.nextInt();
				break;
			}
		}
		mart1();
	}//mart
	
	void mart1() {
		System.out.println("Enter 1 to continue:");
		System.out.println("Enter 2 to Exit:");
		switch (sc.nextInt()) {
		case 1: 
			mart();
			break;
		case 2:
			bill();
			break;
		default:
			System.out.println("Invalid Option");
		}
	}
	void bill() {
		int i=0;
		while (product[i]!=null) {
			System.out.println(i+1+"\t"+product[i]+"\t"+qty[i]+"\t"+price[i]);
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MartTest mt=new MartTest();
		mt.mart();
	}

}

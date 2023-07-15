//ATM.java
package com.nit.bank;

import java.util.Scanner;

public class ATM {
	void insertCard(BankAccount bank) {
		bank.deposite(2500);
		bank.withdraw(500);
		bank.checkBalance();
	}

	public static void main(String[] args) throws Exception{
		Scanner scn=new Scanner(System.in);
		System.out.print("Plese Enter Bank Name: ");
		String bankName=scn.next();
		Class<?> clas=Class.forName(bankName);
		@SuppressWarnings("deprecation")
		Object obj=clas.newInstance();
		if(obj instanceof BankAccount) {
			BankAccount bank=(BankAccount)obj;
			ATM atm=new ATM();
			atm.insertCard(bank);
		}
		scn.close();
	}

}

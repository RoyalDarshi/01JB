//ICCI.java
package com.nit.bank;

public class ICCI implements BankAccount {
	private double balance=0.0;
	
	private static void welcome() {
		System.out.println("\t\t******Welcome to ICCI Bank******\n");
	}
	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		welcome();
		System.out.println("Your current balance is: "+balance+"\n");
	}

	@Override
	public void deposite(double amount) {
		// TODO Auto-generated method stub
		welcome();
		if(amount<=0) {
			System.err.println("Invalid amount!");
			System.err.println("Please enter amount greater than zero");
			return;
		}
		balance+=amount;
		System.out.println("Rs."+amount+" deposited in your bank account");
		System.out.println("Your current balance is: "+balance);
	}

	@Override
	public void withdraw(double amount) {
		welcome();
		// TODO Auto-generated method stub
		if(amount<=0) {
			System.err.println("Invalid amount!");
			System.err.println("Please enter amount greater than zero");
			return;
		}
		else if(amount>balance) {
			System.err.println("Insufficient Balance!");
			return;
		}
		balance-=amount;
		System.out.println("Rs."+amount+" deducted from your bank account");
		System.out.println("Your current balance is: "+balance);
	}
}

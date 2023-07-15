//Paytm.java
package com.nit.bank;

public class Paytm implements BankAccount {
	private double balance = 0.0;

	private static void welcome() {
		System.out.println("\t\t******Welcome to Paytm Bank******\n");
	}

	@Override
	public void checkBalance() {

		welcome();
		System.out.println("Your current balance is: " + balance + "\n");
	}

	@Override
	public void deposite(double amount) {

		welcome();
		if (amount <= 0) {
			System.err.println("Invalid amount!");
			System.err.println("Please enter amount greater than zero");
			return;
		}
		balance += amount;
		System.out.println("Your current balance is: " + balance);
	}

	@Override
	public void withdraw(double amount) {
		welcome();

		if (amount <= 0) {
			System.err.println("Invalid amount!");
			System.err.println("Please enter amount greater than zero");
			return;
		} else if (amount > balance) {
			System.err.println("Insufficient Balance!");
			return;
		}
		balance -= amount;
		System.out.println("Your current balance is: " + balance);
	}
}

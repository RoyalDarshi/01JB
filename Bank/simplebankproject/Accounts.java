package simplebankproject;

import java.util.Scanner;

public class Accounts {

	static final String bankName = "State Bank Of India";
	static final String branchName = "Ammerpet";
	static Scanner sc=new Scanner(System.in);

	static int totalAccounts = 0;
	int[] accountNumber = new int[100];
	String[] userName = new String[100];
	int[] accountPin = new int[100];
	double[] balance = new double[100];

	public Accounts(int totalAccounts) {
		Accounts.totalAccounts = totalAccounts;
	}

	void createAccount() {		
			for (int i = 0; i < totalAccounts; i++) {
				System.out.println("Enter " + (i + 1) + " User Details");
				System.out.print("Enter user Account number:- ");
				int ac_Id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter user Name:- ");
				String name = sc.nextLine();
				System.out.print("Enter user Account Password:- ");
				int pass = sc.nextInt();
				System.out.print("Enter minimum Deposit:- ");
				int bal = sc.nextInt();
				accountNumber[i] = ac_Id;
				userName[i] = name;
				accountPin[i] = pass;
				balance[i] = bal;
				System.out.println();
			}

		System.out.println("Account created");
}

	void createNewAccount() {
		Accounts.totalAccounts++;
		
			System.out.println("Enter User Details");
			System.out.print("Enter user Account number:- ");
			int ac_Id = sc.nextInt();
			sc.nextLine();
			accountNumber[Accounts.totalAccounts - 1] = ac_Id;
			System.out.print("Enter user Name:- ");
			String name = sc.nextLine();
			userName[Accounts.totalAccounts - 1] = name;
			System.out.print("Enter user Account Password:- ");
			int pass = sc.nextInt();
			accountPin[Accounts.totalAccounts - 1] = pass;
			System.out.print("Enter minimum Deposit:- ");
			int bal = sc.nextInt();
			balance[Accounts.totalAccounts - 1] = bal;
		System.out.println();
	}

	void deleteOneaccount() {
		int i, pos = 0;
			System.out.print("Enter user Account number:- ");
			int ac_Id = sc.nextInt();
			for (i = 0; i <= Accounts.totalAccounts; i++) {
				if (ac_Id == accountNumber[i]) {
					pos = i;
					break;
				}
			}//for
			if (pos == 0)
				System.out.println("Wrong Account number");
			else {
				Accounts.totalAccounts--;
				for (i = pos; i < Accounts.totalAccounts; i++) {
					accountNumber[i] = accountNumber[i + 1];
					userName[i] = userName[i + 1];
					accountPin[i] = accountPin[i + 1];
					balance[i] = balance[i + 1];
				}
			}//else
	}

	void showAllAccountDetails() {
		int i;
		System.out.println("\t\t" + Accounts.bankName);
		System.out.println("\t\t" + Accounts.branchName);
		System.out.println("N0.   Account Number \t Username \t Balance");
		for (i = 1; i < totalAccounts; i++) {
			System.out.println(i + " " + accountNumber[i] + " " + userName[i] + " " + balance[i]);
			System.out.println();
		}
	}

	void showOneAccountDetails() {
		int i;
		System.out.print("Enter Account No:- ");
		int ac = sc.nextInt();
		System.out.print("Enter Password:- ");
		int pass = sc.nextInt();
		sc.close();
		int found = 0, f_ac = 0;
		for (i = 1; i < totalAccounts; i++) {
			if (ac == accountNumber[i] && pass == accountPin[i]) {
				found = 1;
				f_ac = i;
				break;
			}
		}
		if (found == 0) {
			System.out.println("Account Number and Password not matching");
		} else if (found == 1) {
			System.out.println("\t\t" + Accounts.bankName);
			System.out.println("\t\t" + Accounts.branchName);
			System.out.println(" Account Number \t Username \t Balance");
			System.out.println(" " + accountNumber[f_ac] + " " + userName[f_ac] + " " + balance[f_ac]);
		} 
	}

	void creditBalance() {
			int i;
			System.out.print("Enter Account number:- ");
			int ac_N = sc.nextInt();
			System.out.print("Enter Account pin:- ");
			int ac_P = sc.nextInt();
			for (i = 0; i < Accounts.totalAccounts; i++) {
				if (ac_N == accountNumber[i] && ac_P != accountPin[i]) {
					System.out.println("Incorrect Password");
				} else if (ac_N == accountNumber[i] && ac_P == accountPin[i]) {
					System.out.print("Enter Money for Credit:- ");
					double money = sc.nextDouble();
					balance[i] += money;
					System.out.println("Money Credited");
					break;
				} else {
					System.out.println("Account number and Password is Incorrect");
				}
			}		
	}

	void debitBalance() {		
			int i;
			System.out.print("Enter Account number:- ");
			int ac_N = sc.nextInt();
			System.out.print("Enter Account pin:- ");
			int ac_P = sc.nextInt();
			for (i = 0; i < Accounts.totalAccounts; i++) {
				if (ac_N == accountNumber[i] && ac_P != accountPin[i]) {
					System.out.println("Incorrect Password");
				} else if (ac_N == accountNumber[i] && ac_P == accountPin[i]) {
					System.out.print("Enter Money for Debit:- ");
					double money = sc.nextDouble();
					if (balance[i] < money) {
						System.out.println("Balance is not Enough");
					} else {
						balance[i] -= money;
						System.out.println("Money Debited");
					}
					break;
				} else {
					System.out.println("Account number and Password is Incorrect");
				}
			}
	}

	void transfer() {
			int i, f1 = 0, f2 = 0, f_ac = 0, t_ac = 0;
			System.out.print("Enter Source Account:- ");
			int sac = sc.nextInt();
			System.out.print("Enter Target Account:- ");
			int tac = sc.nextInt();
			System.out.print("Enter Source Account Password:- ");
			int pin = sc.nextInt();
			for (i = 0; i < Accounts.totalAccounts; i++) {
				if (sac == accountNumber[i]) {
					f1 = 1;
					f_ac = i;
				}
				if (tac == accountNumber[i]) {
					f2 = 2;
					t_ac = i;
				}
			}
			if (f1 == 0) {
				System.out.println("Source Account Not Found");
			} else if (f2 == 0) {
				System.out.println("Target Account Not Found");
			} else if (f1 == 1 && f2 == 1 && pin != accountNumber[f_ac]) {
				System.out.print("Wrong Password");
			} else if (f1 == 1 && f2 == 1 && pin == accountNumber[f_ac]) {
				System.out.print("Enter Amount to Transfer:- ");
				double money = sc.nextDouble();
				balance[f_ac] -= money;
				balance[t_ac] += money;
				System.out.println("Money Transfer Complete");
			} else {
				System.out.println("Input not correct");
			}
		
	}

}
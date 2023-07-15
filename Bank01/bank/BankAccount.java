package bank;

public class BankAccount {

	private static final String bankName;
	private static final String branchName;
	private static final String ifsc;
	private static final long accNO;

	private String accHolName;
	private final long accNum;
	private double balance;
	Address address;

	static {
		bankName = "HDFC";
		branchName = "Ameerpet";
		ifsc = "HDFC0123456";
		accNO = 100000000000L;
	}

	public BankAccount(String name,double amount) {
		// TODO Auto-generated constructor stub
		accHolName=name;
		balance=amount;
		accNum = generateAccNo();
	}

	public String getAccHolName() {
		return accHolName;
	}

	public void setAccHolName(String accHolName) {
		this.accHolName = accHolName;
	}

	public Address getAddress() {
		return address;
	}

	public static String getBankname() {
		return bankName;
	}

	public static String getBranchname() {
		return branchName;
	}

	public static String getIfsc() {
		return ifsc;
	}

	public static long getAccno() {
		return accNO;
	}

	public long getAccNum() {
		return accNum;
	}

	public void getBalance() {
		System.out.println("Your Bank Balance is: Rs"+balance);
	}

	void setAddress() {
		address = new Address();
	}

	private long generateAccNo() {
		return accNO + 1;
	}

	public void deposite(double amount) throws IllegalArgumentException {
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount must be greater than 0");
		}
		balance = balance + amount;
		System.out.println("Rs"+amount+ " is credited to your account " + accNO);
		System.out.println("Now Your Bank Balence is: "+balance+"\n");
	}

	public double withdraw(double amount) throws IllegalArgumentException, IllegalStateException {
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount must be greater than 0");
		}
		if (amount > balance) {
			throw new IllegalStateException("Insufficient Balance!");
		}
		balance-=amount;
		System.out.println("Rs"+amount+ " is debited from your account " + accNO);
		System.out.println("Now Your Bank Balence is: "+balance+"\n");
		return balance;
	}
	
	public void transfer(BankAccount account,double amount)throws IllegalArgumentException,IllegalStateException{
		withdraw(amount);
		account.deposite(amount);
		System.out.println("Rs"+amount+" transfered to "+account.accNum);
	}

	public void display() {
		System.out.println("Account Holder Name\t: " + accHolName);
		System.out.println("Bank Name\t\t: " + bankName);
		System.out.println("Branch Name\t\t: " + branchName);
		System.out.println("Account Number\t\t: " + accNum);
		System.out.println("IFSC\t\t\t: " + ifsc);
		System.out.println("Balance\t\t\t: " + balance);
		System.out.println("Address\t\t\t: " + address+"\n");
	}
}

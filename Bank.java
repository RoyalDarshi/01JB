class Bank {
	public static void main(String[] args) {
		BankAccount.bankName="PAYTM";
		BankAccount.branch="New Delhi";
		BankAccount.ifsc="PYTM0123456";

		BankAccount acnt1=new BankAccount();
		acnt1.accHName="Hari Krishna";
		acnt1.accNo=871922767623L;
		acnt1.bal=87218763;

		BankAccount acnt2=new BankAccount();
		acnt2.accHName="Priyadarshi Roy";
		acnt2.accNo=918982127516L;
		acnt2.bal=10000;

		System.out.println("\t\t**********Account-1 Details**********");
		System.out.println("\n\t\tBank Name\t\t:"+acnt1.bankName);
		System.out.println("\t\tBank Branch\t\t:"+acnt1.branch);
		System.out.println("\t\tIFSC Code\t\t:"+acnt1.ifsc);
		System.out.println("\t\tAccount Holder Name\t:"+acnt1.accHName);
		System.out.println("\t\tAccount Number\t\t:"+acnt1.accNo);
		System.out.println("\t\tCurrent Balance\t\t:"+acnt1.bal);

		System.out.println("\n\n\n\t\t**********Account-2 Details**********");
		System.out.println("\n\t\tBank Name\t\t:"+acnt2.bankName);
		System.out.println("\t\tBank Branch\t\t:"+acnt2.branch);
		System.out.println("\t\tIFSC Code\t\t:"+acnt2.ifsc);
		System.out.println("\t\tAccount Holder Name\t:"+acnt2.accHName);
		System.out.println("\t\tAccount Number\t\t:"+acnt2.accNo);
		System.out.println("\t\tCurrent Balance\t\t:"+acnt2.bal+"\n\n");
	}
}

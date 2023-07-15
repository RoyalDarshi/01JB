package bank;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1=new BankAccount("Binod", 2500000);
		acc1.setAddress();
		acc1.address.setArea("Hitech City");
		acc1.address.setHouseNO(21);
		acc1.address.setCity("Hyd");
		acc1.address.setPinNo(120021);
		acc1.display();
		acc1.getBalance();
	}

}

package simplebankproject;

import java.util.Scanner;

public class UserControl {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("How Many Accounts You want to create:- ");
  int c_ac = Integer.parseInt(sc.nextLine());
  Accounts ac = new Accounts(c_ac);
  ac.createAccount();
  int n;
  char ch = 'y';
  do {
   System.out.println("\n*************************************");
      System.out.println("\n\t\t1) Create New Account");  
   System.out.println("\n\t\t2) Delete One Account");
      System.out.println("\n\t\t3) Show All Account Details");
      System.out.println("\n\t\t4) Show Your Account Details");
      System.out.println("\n\t\t5) Credit Money");
      System.out.println("\n\t\t6) Debit Money");
      System.out.println("\n\t\t7) Transfer Money");
      System.out.print("Enter Input:- ");
      n = Integer.parseInt(sc.nextLine());
      switch(n) {
          case 1: ac.createNewAccount();
              break;
          case 2: ac.deleteOneaccount();
              break;
          case 3: ac.showAllAccountDetails();
              break;
          case 4: ac.showOneAccountDetails();
                    break;
          case 5: ac.creditBalance();
              break;
          case 6: ac.debitBalance();
                    break;
          case 7: ac.transfer();
              break;
          default: System.out.println("Incorrect Input");
      }
      
      System.out.print("\nIf want to continue Enter 'Y' else Enter 'N':- ");
      ch = sc.next().charAt(0);      
  }while(ch == 'Y' || ch == 'y');
  sc.close();
  
  System.out.print("\n\n\t\t\t ThAnK Uh");
  

 }

}
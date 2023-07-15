import java.util.Scanner;
class Transaction {
    public static void main (String[] args) {
        Scanner scn=new Scanner(System.in);
        int amount=scn.nextInt();
        double balance=scn.nextDouble();
        if(amount%5==0&&amount+0.5<=balance) {
            balance-=amount-0.5;
            System.out.println(balance);
        }
        else 
            System.out.println(balance);
    }
}
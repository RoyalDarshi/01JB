//Calc.java
import java.util.Scanner;
class Calc{
	public static void main(String[] args){
		do{
			System.out.println("\nSelect Choice: \n");
			System.out.println("1.Addition: ");
			System.out.println("2.Substraction: ");
			System.out.println("3.Multiplication: ");
			System.out.println("4.Division: ");
			System.out.println("5.Exit: \n");
			System.out.print("Enter Choice: ");
			Scanner scn=new Scanner(System.in);
			int choice=scn.nextInt();
			if(choice==1){
				int[] num=Input.input();
				int res=Addition.add(num[0],num[1]);
				System.out.println("\nAddition is: "+res);
			}else if(choice==2){
				int[] num=Input.input();
				int res=Substraction.sub(num[0],num[1]);
				System.out.println("\nSubstraction is: "+res);
			 }else if(choice==3){
				int[] num=Input.input();
				int res=Multiplication.mul(num[0],num[1]);
				System.out.println("\nMultiplication is: "+res);
			 }else if(choice==4){
				int[] num=Input.input();
				int res=Division.div(num[0],num[1]);
				System.out.println("\nDivision is: "+res);
			 }else if(choice==5){
					 System.out.println("Thank You Come Again...");
				break;
			 }else{
				System.out.println("\nWrong Choice..!\n");
			}
		}while(true);
	}
}

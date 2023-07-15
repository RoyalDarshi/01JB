import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner get=new Scanner(System.in);
		System.out.print("\nEnter First Number: ");
		int a=get.nextInt();
		System.out.print("Enter Second Number: ");
		int b=get.nextInt();
		System.out.println("Enter The Performing Operation:");
		System.out.println(" 1.Addition \n 2.Substraction");
		System.out.println(" 3.Division \n 4.Multiplication");
		System.out.println(" 5.Modulo Division");
		System.out.print("\nEnter the Choice: ");
		int operation=get.nextInt();
		switch(operation) {
			case 1:
				System.out.println("\n\tAddition is:"+(a+b));
				break;
			case 2:
				System.out.println("\n\tSubstraction is:"+(a-b));
				break;
			case 3:
				System.out.println("\n\tDivision is:"+(a/b));
				break;
			case 4:
				System.out.println("\n\tMultiplication is:"+(a*b));
				break;
			case 5:
				System.out.println("\n\tModulo Division is:"+(a%b));
				break;
			default:
				System.out.println("\n\tPlease Enter Value From 1 to 5 !");
		}
	}
}

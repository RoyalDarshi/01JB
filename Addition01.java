import java.util.Scanner;
class Addition01 
{
	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter FNO: ");
		int a=scr.nextInt();
		System.out.print("Enter FNO: ");
		int b=scr.nextInt();
		int c=a+b;
		System.out.println("Result: "+c);
	}
}

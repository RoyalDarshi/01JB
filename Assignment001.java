import java.util.Scanner;
class Assignment001 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter marks:");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();		
		if(no<=30&&no>25)
			System.out.println("A");
		else if(no<=25&&no>20)
			System.out.println("B");
		else if(no<=20&&no>15)
			System.out.println("C");
		else if(no<=15&&no>10)
			System.out.println("D");
		else if(no<=10&&no>5)
			System.out.println("E");
		else if(no<=5&&no>=0)
			System.out.println("F");
		
	}
}

import java.util.Scanner;
class Addition03 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Num: ");
		int num=scn.nextInt();
		scn.nextLine();
		System.out.print("Enter Name: ");
		String name=scn.nextLine();
		System.out.println("Number is: "+num);
		System.out.println("Name is: "+name);
	}
}

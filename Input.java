//Input.java
import java.util.Scanner;
class Input{
	static int[] input(){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter FNO: ");
		int[] num=new int[2];
		num[0]=scn.nextInt();
		System.out.print("Enter SNO: ");
		num[1]=scn.nextInt();
		return num;
	}
}

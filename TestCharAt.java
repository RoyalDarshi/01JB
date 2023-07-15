import java.util.Scanner;
class TestCharAt{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		for(int i=0;i<5;i++){
			System.out.println(str.charAt(i));
		}
	}
}

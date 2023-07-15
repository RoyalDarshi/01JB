package program;

public class Program1 {
	static int isEven(int i) {
		switch(i%2) {
		case 0:
			return 1;
		default:
			return 0;
		}
	}
	public static void main(String[] args) {
		int i=isEven(6);
		if(i==1)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}

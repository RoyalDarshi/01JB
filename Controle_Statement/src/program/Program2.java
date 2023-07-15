package program;

public class Program2 {
	static int oddRounder(int x) {
		if(x%2==0)
			return x;
		while(x>=10) {
			x=x/10;
		}
		return (x+1)*10;
	}

	public static void main(String[] args) {
		int x=oddRounder(31);
		System.out.println(x);
	}
}

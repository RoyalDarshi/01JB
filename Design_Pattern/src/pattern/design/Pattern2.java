package pattern.design;

public class Pattern2 {
	public static void getPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		getPattern(4);
	}
}

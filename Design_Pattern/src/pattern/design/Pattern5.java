package pattern.design;

public class Pattern5 {
	public static void getPattern(int no) {
		for (int i = 0; i < no; i++) {
			for (int j = 0; j < no - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int x = 1; x < no; x++) {
			for (int z = 0; z < x; z++) {
				System.out.print(" ");
			}
			for (int y = no; y > x; y--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		getPattern(4);
	}

}

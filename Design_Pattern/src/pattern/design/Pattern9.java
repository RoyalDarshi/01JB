package pattern.design;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no: ");
		int no = sc.nextInt();
		boolean flag = true;
		int count = 1;
		for (int i = 1; i <= no; i++) {
			if (flag == true) {
				if (count > 1)
					count += no + 1;
				flag = false;
				for (int j = 1; j <= no; j++) {
					System.out.print(count + " ");
					count++;
				}
				System.out.println();
			} else {
				flag = true;
				count = count + no - 1;
				for (int j = no; j >= 1; j--) {
					System.out.print(count + " ");
					count--;
				}
				System.out.println();
			}
		}
		sc.close();
	}

}

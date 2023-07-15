package p1;
public class Multiple_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10,b=2,c;
			c=a/b;
			int[] arr= {10,20,30};
			System.out.println(c);
			System.out.println(arr[8]);
			String str="ankit";
			System.out.println(str.toUpperCase());
		}
		catch (ArrayIndexOutOfBoundsException a) {
			// TODO: handle exception
			System.out.println("Array Exception");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Aruthmetic Exception");
		}
		catch (NumberFormatException n) {
			// TODO: handle exception
			System.out.println("Number Exception");
		}
		catch (Exception x) {
			// TODO: handle exception
			System.out.println("All Type Exception Handeled");
		}
	}

}

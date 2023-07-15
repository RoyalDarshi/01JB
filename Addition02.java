import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class Addition02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.print("Enter Num: ");
		int num=Integer.parseInt(br.readLine());
	    System.out.print("Enter Name: ");
		String name=br.readLine();
		System.out.println("\nNumber is: "+num);
		System.out.println("Name is: "+name);
	}
}

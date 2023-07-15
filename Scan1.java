import java.io.IOException;
import java.io.DataInputStream;
class Scan1 {
	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("Enter Number: ");
		int num=Integer.parseInt(dis.readLine());
		System.out.print("Enter Name: ");
		String name=dis.readLine();
		System.out.println("\nNumber is: "+num);
		System.out.println("Name is: "+name);
	}
}

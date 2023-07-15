import java.io.DataInputStream;
import java.io.IOException;
class ReadLine {
	public static void main(String[] args)throws IOException {
		DataInputStream dis=new DataInputStream(System.in);
		System.out.print("Enter a No: ");
		int a=Integer.parseInt(dis.readLine());
		System.out.print("Enter a No: ");
		int b=Integer.parseInt(dis.readLine());
		System.out.println("Result: "+(a+b));
	}
}

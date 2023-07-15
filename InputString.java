import java.lang.Integer;
import java.io.IOException;
class InputString 
{
	static String stringLine() throws IOException {
		StringBuilder sb=new StringBuilder();
		int data;
		while((data=System.in.read())!=13) {
			sb.append((char)data);
		}
		System.in.read();
		return sb.toString();
	}
	public static void main(String[] args) throws IOException 
	{
		InputString put=new InputString();
		System.out.print("\nEnter  First Number: ");
		int a=Integer.parseInt(put.stringLine());
		System.out.print("Enter Second Number: ");
		int b=Integer.parseInt(put.stringLine());
		int c=a+b;
		System.out.println("\nResult is: "+c);
	}
}

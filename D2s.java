import java.io.IOException;
class D2s 
{
	public static void main(String[] args) throws IOException {
		System.out.print("Enter Number:");
		StringBuilder dataString=new StringBuilder();
		int data;
		while((data=System.in.read())!=10) {
			dataString.append((char)data);
		}
		System.in.read();
		System.out.print(dataString);
		System.out.println(System.in.read());
	}
}

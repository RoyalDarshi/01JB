import java.io.IOException;
class Write {
	static StringBuilder display() throws IOException {
		int data;
		StringBuilder str=new StringBuilder();
		while((data=System.in.read())!=13) {
			str.append((char)data);
			System.out.print((char)data);
		}
		System.in.read();
		return str;
	}
	public static void main(String[] args) throws IOException {
		System.out.print("Please Enter Number:");
		StringBuilder str2=display();
		System.out.println("\n"+str2);
		System.in.read();
	}
}

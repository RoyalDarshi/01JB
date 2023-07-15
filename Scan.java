import java.io.IOException;
class Scan {
	static String getLine() throws IOException {
		StringBuilder dataBuilder = new StringBuilder();
		int data;
		while((data=System.in.read())!=13) {
			dataBuilder.append((char)data);
		}
		System.in.read();
		return dataBuilder.toString();
	}
	public static void main(String[] args) throws IOException {
		System.out.print("Enter number: ");
		int num=Integer.parseInt(getLine());
		System.out.print("Enter Name: ");
		String name=getLine();
		System.out.println("Number is: "+num);
		System.out.println("Name is: "+name);
	}
}

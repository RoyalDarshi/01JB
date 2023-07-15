import java.io.IOException;
class TakingInput {
	static String readLine() throws IOException {
		StringBuilder dataBuilder = new StringBuilder();
		int data;
		while((data=System.in.read())!=13) {
			dataBuilder.append((char)data);
		}
		System.in.read();
		return dataBuilder.toString();
	}
	public static void main(String[] args) throws IOException {
		int a=5,b=1;
		System.out.println(a+" "+b);
		System.out.print("Enter number: ");
		String num=readLine();
		System.out.print("Enter your name: ");
		String name=readLine();
		System.out.println("\nNumber is : "+num);
		System.out.println("Your name is: "+name+"\n");
	}
}

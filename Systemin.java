import java.io.IOException;
class Systemin {
	static String readLine() throws IOException{
		StringBuilder dataString=new StringBuilder();
		int data;
		while((data=System.in.read())!=13){
			dataString.append((char)data);
		}
		System.in.read();
		return dataString.toString();
	}//readLine
	public static void main(String[] args) throws IOException {
		System.out.print("Enter any Data: ");
		String str=readLine();
		System.out.println(str);
		System.out.print("Enter Data:");
		System.out.println(readLine());
	}//main
}//class

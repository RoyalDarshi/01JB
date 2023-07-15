import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class BufferReader {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a No: ");
		int a=Integer.parseInt(br.readLine());
		System.out.print("Enter a No: ");
		int b=Integer.parseInt(br.readLine());
		System.out.println("Result: "+(a+b));
	}
}

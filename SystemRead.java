import java.io.IOException;
class SystemRead {
	public static void main(String[] args) throws IOException {
		System.out.print("Enter name: ");
		char a;
		StringBuilder sb=new StringBuilder();
		while((a=(char)System.in.read())!=13){
			sb.append(a);
			System.out.print(a);
		}
		System.out.println();
		System.out.println(sb);
		System.in.read();
	}
}

import java.util.Scanner;
import java.io.IOException;
class DateChar {
	public static void main(String[] args) throws IOException {
		System.out.println("Please enter Date(dd/mm/yyyy):");
		int data;
		char[] srr=new char[10];
		StringBuilder str=new StringBuilder();
		int i=0;
		while((data=System.in.read())!=13) {
			if(data!=47) {
				srr[i]=(char)data;
				str.append((char)data);
				i++;
			}
		}
		System.out.print(srr[0]);
		System.out.print(srr[1]);
		System.out.print("-"+srr[2]);
		System.out.print(srr[3]);
		System.out.print("-"+srr[4]);
		System.out.print(srr[5]);
		System.out.print(srr[6]);
		System.out.print(srr[7]);
	}
}

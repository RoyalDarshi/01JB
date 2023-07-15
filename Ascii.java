import java.util.Scanner;
class  Ascii{
	static int nameLength(String name){
		int count=0;
		for(int i=0;i<name.length();i++){
			if(name.charAt(i)!=32)
				count++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		int n=nameLength("Hi Hello");
		System.out.println(n);
	}
}

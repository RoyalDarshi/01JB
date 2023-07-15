import java.lang.*;
import java.io.*;
class ReverseString 
{
	public static void main(String[] args) 
	{
		String str="mhhm";
		StringBuffer sf=new StringBuffer();
		int j=0;
		for(int i=str.length()-1;i>=0;i--){
			sf.append(str.charAt(i));
			j++;
		}
		
		if(str.contentEquals(sf)){
			System.out.println("name is palindrome");
		}
		else{
			System.out.println("Name is not palindrome");
		}
	}
}

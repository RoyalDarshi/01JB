import java.util.Scanner;
import java.io.Console;
class LoginValidation {
	public static void main(String[] args) {
		Console cns=System.console();
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter your UserID: ");
		String uid=scn.next();
		System.out.print("Enter Password: ");
		char[] pwdChar=cns.readPassword();
		String pwd=new String(pwdChar);
		if(pwd.equals("abc")&&uid.equals("Admin"))
			System.out.println("Login Successfull");
		else
			System.out.println("Invalid Userid/Password");
	}
}

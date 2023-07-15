import java.io.Console;
class LoginScreen {
	public static void main(String[] args) {
		Console cns=System.console();
		System.out.print("Enter Username: ");
		String userName=cns.readLine();
		System.out.print("Enter Password: ");
		char[] passcode=cns.readPassword();
		String password=new String(passcode);
		System.out.println("Username is: "+userName);
		System.out.println("Password is: "+password);
	}
}

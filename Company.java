import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Console;
import java.util.Scanner;
class Company {
	public static void main(String[] args) throws IOException{
		Console cns = System.console();
		System.out.print("Enter Username: ");
		String usn = new String(cns.readLine());
		System.out.print("Enter Password: ");
		String pwd = new String(cns.readPassword());
		if(usn.equalsIgnoreCase("HK")&&pwd.equals("NiT")){
			Employee emp = new Employee();
			emp.empno=Integer.parseInt(args[0]);
			emp.ename=args[1];
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Dept: ");
			emp.dept=Integer.parseInt(br.readLine());
			System.out.print("Enter Salary: ");
			emp.sal=Double.parseDouble(br.readLine());
			Scanner scn = new Scanner(System.in);
			System.out.print("Enter MobileNo: ");
			emp.mobile=scn.nextLong();scn.nextLine();
			System.out.print("Enter Email: ");
			emp.email=scn.next();
			emp.gender=System.getProperty("gender").charAt(0);
			emp.status=Boolean.parseBoolean(System.getProperty("status"));
			System.out.println("\nEmp Object Details");
			System.out.println(" Eno\t\t\t: "+emp.empno);
			System.out.println(" Ename\t\t\t: "+emp.ename);
			System.out.println(" Sal\t\t\t: "+emp.sal);
			System.out.println(" Dept\t\t\t: "+emp.dept);
			System.out.println(" Mobile\t\t\t: "+emp.mobile);
			System.out.println(" Email\t\t\t: "+emp.email);
			System.out.println(" Gender\t\t\t: "+emp.gender);
			System.out.println(" Working Status\t\t: "+emp.status);
		}else{
			System.out.println("Tumri Fellow:Input Username Password!");
		}
	}
}

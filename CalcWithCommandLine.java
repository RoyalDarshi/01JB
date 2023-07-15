class CalcWithCommandLine 
{
	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer. parseInt(args[1]);
		System.out.println("\nAddition is:"+(a+b));
		System.out.println("Substraction is:"+(a-b));
		System.out.println("Multiplication is:"+(a*b));
		System.out.println("Division is:"+(a/b));
		System.out.println("Modulo Division is:"+(a%b));
	}
}

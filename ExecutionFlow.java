class ExecutionFlow {
	static int a1=m1();	
	static int m1(){
		System.out.println("SV Executed");
		return 10;
	}
	static{
		System.out.println("SB Executed");
	}
	static void m2(){
		System.out.println("SM Executed");
	}
	static class A
	{
	}
	int a2=m1();
	int m3(){
		System.out.println("NSV Executed");
		return 10;
	}
	{
		System.out.println("NSB Executed");
	}
	ExecutionFlow(){
		System.out.println("NPC Executed");
	}
	class A1
	{
	}
	public static void main(String[] args) 
	{
		System.out.println("MM Executed");
		ExecutionFlow ob=new ExecutionFlow();
		ExecutionFlow ob1=new ExecutionFlow();
	}
}

class Example2 
{
	static int m1(){
		int a=10;
		System.out.println("Hello");
		return a;
	}
	int m2(){
		System.out.println("Welcome");
		return 20;
	}
	public static void main(String[] args){
		int b=m1();
		System.out.println(b);
		Example2 ex=new Example2();
		int c=ex.m2();
		System.out.println(c);
	}
}

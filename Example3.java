class Example3 
{
	static int x=67;
	int y=98;
	void sum(int a,int b){ 
		int c=0;
		System.out.println("Sum : "+(a+b));
	}
	
	
	public static void main(String[] args) 
	{
		Example3 ex=new Example3();
		System.out.println(ex.y);
		ex.sum(21,43);
		System.out.println(ex.x);
	}
}

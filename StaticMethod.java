class StaticMethod {
	int a=10;
	int b=20;
	static void show(){
		NonStaticMethod nv=new NonStaticMethod();
		System.out.println(nv.a);
		System.out.println(nv.b);
	}
	public static void main(String[] args) 
	{
		show();
	}
}

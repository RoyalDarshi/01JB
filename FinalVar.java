class FinalVar {
	static final int x;
	static{
		x=10;
	}
	FinalVar(){
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!"+x);
		final int z;
		z=10;
		System.out.println(z);
	}
}

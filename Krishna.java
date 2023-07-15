class Krishna extends Hari
{
	void m1(){
		System.out.println("Krishna M1");
	}
	static void m2(){
		System.out.println("Krishna M2");
	}
	void m4(){
		System.out.println("Krishna M4");
	}

	public static void main(String[] args) 
	{
		//Krishna k=new Krishna();
		//k.m1();//Krishna NSM
		//k.m2();//Krishna SM
		Hari h=new Krishna();
		//h.m1();//Krishna NSM
		h.m2();//Hari SM
		h.m3();
		//h.m4();
	}
}

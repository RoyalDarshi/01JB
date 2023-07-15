class Examples {
	static int a=m1();
	static{
		System.out.println("Example SB");
	}
	int x=m2();
	{
		System.out.println("Example NSB");
	}
	Examples(){
		System.out.println("Example constructor");
	}
	static int m1(){
		System.out.println("Example SV is created");
		return 10;
	}
	int m2(){
		System.out.println("Example NSV iscreated");
		return 20;
	}
	void abc(){
		System.out.println("Example abc");
	}
	void bbc(){
		System.out.println("Example bbc");
	}
}

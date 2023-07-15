class Sample5 extends Example5 {
	static void m1(){
		System.out.println("M1 from Sample");
	}
	public static void main(String[] args){
		Sample5 s=new Sample5();
		s.m1();
		s.m2();
		Example5 e=s;
		e.m1();
		e.m2();
	}
}

class NonStaticMethod {
	int a=10;
	int b=20;
	void show(){
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		NonStaticMethod nv=new NonStaticMethod();
		nv.show();
	}
}

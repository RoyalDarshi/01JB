class College {
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.sno=101;
		s1.sname="HK";
		s1.course="CJ";
		s1.fee=2500;
		s1.address=new Address();
		s1.address.strNum=1;
		s1.address.city="Hyd";
		System.out.println();
		s2.sno=102;
		s2.sname="BK";
		s2.course="Actor";
		s2.fee=3500;
		s2.address=new Address();
		s2.address.strNum=2;
		s2.address.city="Sec";
		System.out.println("S1 Values");
		System.out.println(s1);
		System.out.println("S2 Values");
		System.out.println(s2);
	}
}

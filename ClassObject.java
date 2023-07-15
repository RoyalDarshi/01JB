class Student {
	int roll=2001;
	String name="Priyadarshi";
	char gender='M';
	int[] marks={67,59,56};
	long mobileNo=8982127516L;
	boolean pass=true;
}//End of Student class
class ClassObject {
	static void details() {
			Student get=new Student();
			System.out.println("******Student Details******");
			System.out.println("Name: "+get.name);
			System.out.println("Roll: "+get.roll);
			System.out.println("Gender: "+get.gender);
			System.out.println("Pass: "+get.pass);
			System.out.println("Math Marks: "+get.marks[0]);
			System.out.println("Physics Marks: "+get.marks[1]);
			System.out.println("Chemistry Marks: "+get.marks[2]);
			System.out.println("Mobile Number: "+get.mobileNo);
		}
	public static void main(String[] args) {
		details();
	}
}
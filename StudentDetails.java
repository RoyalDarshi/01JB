import java.util.HashMap;
class StudentDetails {
	public static void main(String[] args) {
		HashMap<String,String> student=new HashMap<String,String>();
		student.put("name","Priyadarshi Roy");
		student.put("rollno","0116CS181031");
		student.put("branch","CSE");
		student.put("college","A.S.C.T. Bhopal");
		student.put("university","R.G.P.V. Bhopal");
		student.put("age","22");
		student.put("gender","M");
		System.out.println("");
		System.out.println("\t\t======Student Details======\n");
		System.out.println("\t\tName is: "+student.get("name"));
		System.out.println("\t\tRoll is: "+student.get("rollno"));
		System.out.println("\t\tBranch is: "+student.get("branch"));
		System.out.println("\t\tCollege is: "+student.get("college"));
		System.out.println("\t\tUniversity is: "+student.get("university"));
		System.out.println("\t\tAge is: "+student.get("age"));
		System.out.println("\t\tGender is: "+student.get("gender"));
	}
}
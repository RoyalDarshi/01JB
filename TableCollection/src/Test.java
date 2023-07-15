
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableCollection tc=new TableCollection();
		System.out.println(tc.capacity());
		System.out.println(tc.size());
		tc.add("fname", "Priyadarshi");
		System.out.println(tc);
		tc.add("lname", "Roy");
		System.out.println(tc);
		tc.add("Roll", 1521);
		System.out.println(tc);
		System.out.println(tc.remove("Roy"));
		System.out.println(tc.size());
		
	}

}

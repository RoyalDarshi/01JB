import java.util.Vector;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Object> v1=new Vector<Object>();
		v1.add(null);
		System.out.println(v1);
		v1.add("kalu");
		Vector<Object> v2=new Vector<Object>();
		System.out.println(v1);
		v1.remove(0);
		System.out.println(v1);
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		System.out.println(v1.contains("kalu"));
		System.out.println(v1.contains(null));
		System.out.println(v1.equals(v2));
		v2.add("kalu");
		System.out.println(v1.equals(v2));
	}

}

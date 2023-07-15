public class Test {

	public static void main(String[] args) {
		 
		NITCollection nit=new NITCollection();
		System.out.println(nit.capacity());
		System.out.println(nit.size());
		System.out.println(nit);
		nit.add(1);
		nit.add("Priyadarshi");
		nit.add(new Test());
		nit.add(true);
		nit.add(null);
		System.out.println(nit.capacity());
		System.out.println(nit.size());
		System.out.println(nit);
		nit.remove(2);
		System.out.println(nit);
		nit.add("Roy", 2);
		System.out.println(nit);
		nit.replace("007", 0);
		System.out.println(nit);
	}

}

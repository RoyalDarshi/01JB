package com.nit.LinkedList;

public class MyList01 {

	public static void main(String[] args) {

		List ls = new List();
		System.out.println(ls);
		ls.add("Hari");
		System.out.println(ls);
		ls.add(56);
		ls.add("Hiii");
		ls.add(2, "Loki");
		ls.add(0, null);
		System.out.println(ls);
		ls.add(3, null);
		System.out.println(ls);
		System.out.println("Contains: " + ls.contains("Loki"));
		System.out.println(ls.indexOf(56));
		System.out.println(ls);
	}

}

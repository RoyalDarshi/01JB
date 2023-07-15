package com.nit.vector;

public class MyVector01 {

	public static void main(String[] args) {		
		Vector01 vctr=new Vector01();
		vctr.add("A");
		vctr.add(5);
		vctr.add("Hari");
		vctr.add(5);
		vctr.add(97);
		vctr.add('A');
		vctr.add("Hari");
		System.out.println(vctr.size());
		System.out.println(vctr.capacity());
		System.out.println(vctr);
		System.out.println(vctr.contains(5));
		System.out.println(vctr.contains("A"));
		System.out.println(vctr.contains(65));
		System.out.println(vctr.contains('A'));
		System.out.println(vctr.contains('a'));
		System.out.println(vctr.contains((int)'a'));
		System.out.println(vctr.indexOf("A"));
		System.out.println(vctr.indexOf(65));
		System.out.println(vctr.indexOf('A'));
		System.out.println(vctr.remove(3));
		System.out.println(vctr);
		//System.out.println(vctr.remove(70));
		System.out.println(vctr);		
		vctr.add(3, "Hiii");
		System.out.println(vctr);
		System.out.println(vctr.remove("A"));
		System.out.println(vctr);
		vctr.add(null);
		System.out.println(vctr);
		System.out.println(vctr.remove(null));
		System.out.println(vctr);
	}

}

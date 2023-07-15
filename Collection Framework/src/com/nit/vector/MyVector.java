package com.nit.vector;

import java.util.Vector;

public class MyVector {
	public static void main(String[] args) {
		Vector<Object> ve=new Vector<>();
		System.out.println("capacity ==>"+ve.capacity());
		System.out.println("size ==>"+ve.size());
		ve.add("a");
		ve.add(null);
		ve.add(5);
		ve.add(6.7);
		ve.add(new Ex(4,3));
		ve.add(1, 'a');
		ve.add("a");
		System.out.println("capacity ==>"+ve.capacity());
		System.out.println("size ==>"+ve.size());
		System.out.println(ve);
		System.out.println(ve.contains("A"));
		System.out.println(ve.contains("a"));
		System.out.println(ve.contains('a'));
		System.out.println(ve.contains(6.7));
		System.out.println(ve.contains(new Ex(4,3)));
		Ex e1=(Ex)ve.get(ve.indexOf(new Ex(4,3)));
		e1.setI(e1.getI()+10);
		e1.setJ(e1.getJ()+10);
		System.out.println(ve);
		System.out.println(ve.contains(e1));
		System.out.println(e1);
		System.out.println(ve.lastIndexOf("a"));
		
	}
}

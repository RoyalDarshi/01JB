package com.nit.LinkedList;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Object> ls=new LinkedList<>();
		System.out.println(ls.size());
		ls.add("Hari");
		ls.add(null);
		ls.add(65);
		ls.add(1, "Hiii");
		System.out.println(ls.size());
		System.out.println(ls);
		ls.remove(-1);
	}

}

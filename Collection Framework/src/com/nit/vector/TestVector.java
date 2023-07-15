package com.nit.vector;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {

		Vector<Object> vc = new Vector<>();
		vc.add(5);
		vc.add(0, "hari");
		vc.remove("ccg");
		System.out.println(vc);
	}

}

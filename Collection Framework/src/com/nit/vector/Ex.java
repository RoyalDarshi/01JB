package com.nit.vector;

public class Ex {

	private int i;
	private int j;

	public Ex(int i, int j) {
		// TODO Auto-generated constructor stub
		this.i=i;
		this.j=j;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Ex e1;
		if(obj instanceof Ex) {
			e1=(Ex)obj;
			return this.i==e1.i&&this.j==e1.j;
		}
			
		return false;
	}

	@Override
	public String toString() {
		return "Ex("+i+","+j+")";
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	
	

}

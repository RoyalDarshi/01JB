package com.nit.vector;

/**
 * @author RoyalDarshi
 *
 */
public class Vector01 {
	
	private int size=0;
	private int capacity=10;
	private Object[] arrayList=null;
	
	public Vector01() {
		arrayList=new Object[capacity];
	}
	
	public int size() {
		return size;
	}
	public int capacity() {
		return capacity;
	}
	
	private void increaseCapacity() {
		Object[] myArray=new Object[capacity*2];
		for(int i=0;i<size();i++)
			myArray[i]=arrayList[i];
		arrayList=myArray;
		capacity=capacity*2;
	}
	
	public boolean add(Object obj) {
		if(size()==capacity()) {
			increaseCapacity();
		}
		arrayList[size]=obj;
		size++;
		return true;
	}
	
	public boolean contains(Object obj) {
		for(int i=0;i<size();i++) {
			if(obj.equals(arrayList[i]))
				return true;		
		}
		return false;
		
	}
	public Object remove(int index) {		
		if(index>=size())
			throw new ArrayIndexOutOfBoundsException("Array index out of range: "+index);
		Object obj=arrayList[index];
		if(index<size()) {
			for(;index<size()-1;index++) {
				arrayList[index]=arrayList[index+1];
			}
			arrayList[size()-1]=null;
			size--;
		}
		return obj;
	}
	public boolean remove(Object obj) {
		if(obj==null) {
			for(int i=0;i<size();i++) {
				if(arrayList[i]==obj) {
					for(;i<size();i++) {
						arrayList[i]=arrayList[i+1];
					}
					size--;
					return true;
				}
			}
		}
		for(int i=0;i<size();i++) {
			if(obj.equals(arrayList[i])) {
				for(;i<size();i++) {
					arrayList[i]=arrayList[i+1];
				}
				size--;
				return true;
			}
		}
		
		return false;
	}
	public boolean add(int index,Object obj) {
		if(size()==capacity())
			increaseCapacity();
		if(index>size())
			throw new ArrayIndexOutOfBoundsException(index+">"+size());
		for(int i=size();index<=i;i--)
			arrayList[i+1]=arrayList[i];
		arrayList[index]=obj;
		size++;
		return true;
	}
	public int indexOf(Object obj) {
		for(int i=0;i<size();i++) {
			if(obj.equals(arrayList[i]))
				return i;
		}
		return -1;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<size();i++) {
			sb.append(arrayList[i]);
			if(i!=size()-1)
				sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}
	

}

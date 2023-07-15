package com.nit.Queue;

public class Queue {
	private int[] arr = new int[10];
	private int size = 0;
	private int front, rear = -1;

	public int getSize() {
		return size;
	}
	
	public int getFirstElement() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return arr[front];
	}

	public boolean isEmpty() {
		return getSize() == 0;
	}

	public boolean isFull() {
		return getSize() == arr.length;
	}

	public void enQueue(int value) {
		if (isFull()) {
			System.out.println("Queue is Full!");
		}
		else {
			size++;
			rear++;
			arr[rear%arr.length] = value;
		}
	}

	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!");
		}
		else {
			size--;
			front++;
		}
	}
	
	public void show() {
		System.out.print("Elements : ");
		for(int i=0;i<getSize();i++) {
			System.out.print(arr[(front+i)%arr.length]+" ");
		}
	}
}

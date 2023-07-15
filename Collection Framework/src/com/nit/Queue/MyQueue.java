package com.nit.Queue;

public class MyQueue {

	public static void main(String[] args) {

		Queue q = new Queue();
		q.enQueue(12);
		q.enQueue(13);
		q.deQueue();
		q.enQueue(14);
		q.enQueue(15);
		q.enQueue(16);
		q.enQueue(17);
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.enQueue(18);
		q.enQueue(12);
		q.deQueue();
		q.deQueue();
		System.out.println(q.getFirstElement());
		q.show();
	}

}

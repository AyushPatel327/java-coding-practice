package com.capg.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImpl {

	public static void main(String[] args) {

		Queue<Integer> queue = new PriorityQueue<>();
 
		// out - 56 43 77 99 - in
		queue.add(56);
		queue.add(43);
		queue.add(77);
		queue.add(99);
		queue.remove();

		Iterator<Integer> itr = queue.iterator();

		System.out.println("Queue: ");
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			System.out.print(integer + " ");
		}
	}
}

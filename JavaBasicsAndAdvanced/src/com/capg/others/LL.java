package com.capg.others;

import java.util.Iterator;
import java.util.Vector;

public class LL {
	Node head;

	class Node {
		String data;
		Node next;

		public Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void printList() {
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		System.out.println("null");
	}

	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("list is already empty");
			return;
		}
		head = head.next;
	

	}
	public void deleteLast() {
		
		if (head == null) {
			System.out.println("list is already empty");
			return;
		}
		Node secondLast = head;
		Node lastNode = head.next;
		
		//Hi->Hello->Im last->null
		
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
		
	}

	public static void main(String[] args) {
		LL obj = new LL();
		obj.addFirst("Hello");
		obj.addFirst("Hi");
		obj.addFirst("First");
		obj.addLast("Im last");
		obj.deleteFirst();
		obj.deleteLast();
		obj.printList();

		
	}

}

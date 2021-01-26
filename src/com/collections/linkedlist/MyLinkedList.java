package com.collections.linkedlist;

public class MyLinkedList {

	static Node head;

	class Node {
		int data;
		Node next;

		Node(final Node next, final int data) {
			this.next = next;
			this.data = data;
		}
	}

	public static void main(final String[] args) {
		final MyLinkedList list = new MyLinkedList();
		for (int i = 0; i < 5; i++) {
			list.push(i);
			list.printList();
		}
	}

	private void printList() {
		while (head != null) {
			System.out.print(head.data + "-> ");
			head = head.next;
		}
		System.out.println("null");
	}

	private void push(final int i) {
		final Node node = new Node(head, i);
		head = node;
	}

}

package com.collections.linkedlist;

class LinkedList {

	static Node head;

	class Node {
		int data;
		Node next;

		public Node(final Node next, final int data) {
			this.data = data;
			this.next = next;
		}
	}

	private void printList(Node head) {

		while (head != null) {
			System.out.print(head.data + " ->");
			head = head.next;
		}
		System.out.println("null");
	}

	private void push(final Node headRef, final int newData) {
		final Node newNode = new Node(headRef, newData);
		head = newNode;
	}

	public static void main(final String[] args) {
		final LinkedList llist = new LinkedList();
		for (int i = 5; i > 0; --i) {
			llist.push(head, i);
			llist.printList(head);
			// llist.printMiddle();
		}
	}

}

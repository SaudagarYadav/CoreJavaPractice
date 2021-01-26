package com.data.custom.singlelinkedlist;

public class EmployeeLinkedList {

	private EmployeeNode head;
	private int size;

	public void addToFront(final Employee employee) {
		final EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;
	}

	public EmployeeNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}

		final EmployeeNode removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}

	public void reverseList() {
		final EmployeeNode current  = head;
		EmployeeNode next = head.getNext();
		
		while(next !=null) {
			next = head.getNext();
			next.setNext(current);
			head = next;
		}
	}

}

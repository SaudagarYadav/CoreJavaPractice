package com.data.custom.singlelinkedlist;

public class EmpLLImp {

	private EmployeeNode head;
	private int size = 0;

	public void add(final Employee employee) {
		final EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;
	}

	public EmployeeNode remove() {
		if (head == null) {
			return null;
		}
		final EmployeeNode removeNode = head;
		head = removeNode.getNext();
		size--;
		removeNode.setNext(null);
		return head;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return size;
	}

	public void print() {
		EmployeeNode current = head;
		while (current != null) {
			System.out.println(current);
			System.out.println();
			current = current.getNext();
		}
	}

}

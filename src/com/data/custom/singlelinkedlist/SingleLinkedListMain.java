package com.data.custom.singlelinkedlist;

public class SingleLinkedListMain {

	public static void main(final String[] args) {

		empLinkList();
		// empLinkListReturns();

	}

	private static void empLinkListReturns() {
		final Employee janeJones = new Employee("Jane", "Jones", 123);
		final Employee johnDoe = new Employee("John", "Doe", 4567);
		final Employee marySmith = new Employee("Mary", "Smith", 22);
		final Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		final EmpLLImp list = new EmpLLImp();
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		list.add(janeJones);
		list.add(johnDoe);
		list.add(marySmith);
		list.add(mikeWilson);
		// list.print();

		list.remove();
		list.print();
		System.out.println(list.isEmpty());
		System.out.println(list.size());

	}

	private static void empLinkList() {
		final Employee janeJones = new Employee("Jane", "Jones", 123);
		final Employee johnDoe = new Employee("John", "Doe", 4567);
		final Employee marySmith = new Employee("Mary", "Smith", 22);
		final Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

		final EmployeeLinkedList list = new EmployeeLinkedList();

		//System.out.println(list.isEmpty());

		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);

		// System.out.println(list.getSize());

		list.printList();

		/*list.removeFromFront();
		System.out.println(list.getSize());
		list.printList();*/
		
		list.reverseList();
		System.out.println();
		list.printList();
	}
}

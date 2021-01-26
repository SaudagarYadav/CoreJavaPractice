package com.data.custom.singlelinkedlist;

public class EmployeeNode {

	private Employee employee;
	private EmployeeNode next;

	public EmployeeNode(final Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(final Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(final EmployeeNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return employee.toString();
	}
}

package com.data.custom.singlelinkedlist;

public class Employee {

	private String firstName;
	private String lastName;
	private int id;

	public Employee(final String firstName, final String lastName, final int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		final Employee employee = (Employee) o;

		if (id != employee.id)
			return false;
		if (!firstName.equals(employee.firstName))
			return false;
		return lastName.equals(employee.lastName);
	}

	@Override
	public int hashCode() {
		int result = firstName.hashCode();
		result = 31 * result + lastName.hashCode();
		result = 31 * result + id;
		return result;
	}

	@Override
	public String toString() {
		return "Employee{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", id=" + id + '}';
	}

}

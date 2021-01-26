package com.string;

public class StringMainClass {

	public static void main(String[] args) {
		Immutuble immutuble = Immutuble.getInstance(5);
		System.out.println(immutuble.getId());
	}
}

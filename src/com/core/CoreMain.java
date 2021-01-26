package com.core;

import java.util.ArrayList;
import java.util.List;

public class CoreMain {

	public static void main(final String[] args) {

		test1(5);
		Parent.test();
		final Parent p = new Parent();
		p.test();
		
		test(new Parent());
		test(new Child());
		
		test(new ArrayList<Parent>());
		// test(new ArrayList<Child>());
		
		final List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		test(list);
		System.out.println(list);
	}
	
	public static void test1(final int a) {
		System.out.println("int");
	}
	public void test1(final Integer a) {
		System.out.println("integer");
	}

	private static void test(final List<Integer> list) {

		list.add(8);
		
	}

	private static void test(final ArrayList<Parent> arrayList) {
		// TODO Auto-generated method stub
		
	}

	private static void test(final Parent parent) {
		// TODO Auto-generated method stub
		
	}

}

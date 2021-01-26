package com.generics;

public class App {

	public static <T> void test(T t)  {
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		test("Saudagar");
	}
}

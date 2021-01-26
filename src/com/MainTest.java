package com;

public class MainTest {

	{
		System.out.println("Instance block");
	}

	MainTest() {
		System.out.println("Const");
	}

	{
		System.out.println("inst2");
	}

	static {
		System.out.println("Static");
	}

	public static void main(final String[] args) {

		final MainTest test = new MainTest();
		test();
	}

	private static void test() {

		System.out.println("teststsc");
		{
			System.out.println("test");
		}
		System.out.println("tesjhvjht");
		throw new ArrayIndexOutOfBoundsException();
	}

}

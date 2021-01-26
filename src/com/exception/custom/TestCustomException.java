package com.exception.custom;

public class TestCustomException {

	public static void main(final String[] args) {
		try {
			throw new MyException();
		} catch (final MyException e) {
			// TODO Auto-generated catch block
			System.out.println("test");
			e.printStackTrace();
		}
	}
}

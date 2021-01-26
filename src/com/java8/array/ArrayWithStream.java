package com.java8.array;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayWithStream {

	public static void main(final String[] args) {
		final String s = "My name is saudagar";
		Stream<String> arr = Arrays.stream(s.split(" "));
		arr = arr.sorted();
		arr.forEach(System.out::println);
	}
}

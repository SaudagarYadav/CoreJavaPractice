package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(5);
		arr.add(2);
		arr.add(2);
		arr.add(2);
		arr.add(5);
		arr.add(7);

		List<Integer> arrTemp = new ArrayList<Integer>();
		arrTemp.add(arr.get(0));

		for (int i = 1; i < arr.size(); i++) {

			if (!arrTemp.contains(arr.get(i))) {
				arrTemp.add(arr.get(i));
			}
			if (arrTemp.size() == 3) {
				System.out.println(arr.get(i));
			}
		}
	}
}

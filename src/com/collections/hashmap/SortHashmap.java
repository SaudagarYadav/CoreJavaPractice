package com.collections.hashmap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortHashmap {

	public static void main(final String[] args) {
		final Map<Integer, Emp> map = new HashMap();
		final Emp e1 = new Emp(4, "Sauadgar");
		final Emp e2 = new Emp(1, "Amit");
		final Emp e3 = new Emp(3, "Chotu");
		final Emp e4 = new Emp(2, "Motu");
		final Emp e5 = new Emp(2, "Motu");
		map.put(103, e1);
		map.put(104, e2);
		map.put(101, e3);
		map.put(100, e4);
		map.put(102, e5);
		System.out.println("Actual Data");
		map.forEach((k, v) -> System.out.println(k + " : " + v));

		// sortBykey(map);
	}

	@SuppressWarnings({ "unused", "unchecked" })
	private static void sortBykey(final Map<Integer, Emp> map) {
		@SuppressWarnings("rawtypes")
		final List list = new LinkedList(map.entrySet());

	}
}

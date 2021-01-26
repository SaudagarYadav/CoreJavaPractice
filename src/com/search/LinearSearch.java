package com.search;

public class LinearSearch implements ISearch{

	@Override
	public int search(int[] a, int b) {
		System.out.println("Linear search");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				return i;
			}
		}
		return 0;
	}

}

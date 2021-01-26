package com.data.custom.arraylist;

import java.util.Arrays;

public class ArrayListDemo {

	private static int actualIndex = 0;
	private static int size = 5;
	static Object[] arr;

	public void add(final Object obj) {
		if (actualIndex >= size) {
			grow();
		}
		arr[actualIndex++] = obj;
	}

	public ArrayListDemo() {
		arr = new Object[size];
	}

	private void grow() {
		size = size * 2;
		arr = Arrays.copyOf(arr, size * 2);
		System.out.println("Grow called");
	}

	public Object get(final int index) {
		if (index < actualIndex && arr[index] != null) {
			return arr[index];
		}
		return null;
	}

	public void remove(final int index) {
		if (index < actualIndex) {
			actualIndex--;
			System.out.println("Removed : " + arr[index]);
			for (int i = index; i < arr.length; i++) {
				if (i < arr.length - 1) {
					arr[i] = arr[i + 1];
				} else {
					arr[i] = null;
				}

			}
		}
	}

	public static void demo() {

		final ArrayListDemo listDemo = new ArrayListDemo();
		listDemo.add(10);
		listDemo.add(20);
		listDemo.add(30);
		listDemo.add(40);
		listDemo.add(50);
		listDemo.add(60);
		listDemo.add(60);
		listDemo.add(70);
		listDemo.remove(3);
		for (int i = 0; i < actualIndex; i++) {
			System.out.println(listDemo.get(i));
		}
	}

	public static void main(final String[] args) {
		demo();
	}

}

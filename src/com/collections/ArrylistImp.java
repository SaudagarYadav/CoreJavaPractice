package com.collections;

import java.util.Arrays;

public class ArrylistImp {
	Object arr[];
	private static int size = 4;
	private static int index = 0;

	public ArrylistImp() {
		arr = new Object[size];
	}

	public void add(Object o) {
		if (index>=size - 1) {
			grow();
		}
		arr[index++] = o;
	}

	public void grow() {
		size = size*2;
		arr = Arrays.copyOf(arr, size * 2);
		System.out.println("Grow called");
	}

	public Object get(Integer i) {
		if (i < index && arr[i] != null) {
			return arr[i];
		}
		return null;
	}

	public void remove(Integer i) {
		if (i <= index) {
			for (int j = i; j < arr.length-1; j++) {
				if(arr[j + 1] != null) {
					arr[j] = arr[j + 1];
					arr[j + 1] = null;
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrylistImp list = new ArrylistImp();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(91);
		list.add(45);
		list.add(8);
		list.remove(1);
		for (int i = 0; i < list.size; i++) {
			System.out.println(list.get(i));
		}

	}
}

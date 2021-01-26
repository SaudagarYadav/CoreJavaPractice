package com.sorting;

public class SelectionSort implements ISort {

	@Override
	public void sort(final int[] arr) {
		System.out.println("-*Using Selection sort*-");
		int index = 0;
		int smallest = arr[index];
		for (int i = 0; i < arr.length; i++) {
			index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			smallest = arr[index];
			arr[index] = arr[i];
			arr[i] = smallest;
		}

	}

}

package com.sorting;

import java.util.Arrays;

public class InsertionSort implements ISort {

	@Override
	public void sort(final int[] arr) {
		System.out.println("-*Using Insertion sort*-");
		for (int i = 1; i < arr.length; i++) {
			System.out.println();
			final int key = arr[i];
			int j = i - 1;
			while (j > -1 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
			Arrays.stream(arr).forEach((a) -> System.out.print(a + " "));
		}
	}
}

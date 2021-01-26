package com.sorting;

public class SortDemo {

	static ISort sortObj;

	public static void main(final String[] args) {
		final int[] arr = { 9, 14, 3, 2, 43, 11, 58, 22 };

		// sortObj = new BubbleSort();
		sortObj = new InsertionSort();
		// sortObj = new MergeSorted();
		// sortObj = new SelectionSort();
		sort(arr, sortObj);
		// Arrays.stream(arr).forEach((a) -> System.out.print(a + " "));

	}

	private static void sort(final int[] arr, final ISort sort) {
		sort.sort(arr);
	}

}

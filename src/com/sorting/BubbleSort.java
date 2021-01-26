package com.sorting;

public class BubbleSort implements ISort {

	@Override
	public void sort(final int[] arr) {
		System.out.println("Bubble sort");
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}

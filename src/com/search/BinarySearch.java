package com.search;

import java.util.Arrays;

public class BinarySearch implements ISearch{

	public int search(int[] a, int s) {

		System.out.println("Binary search");
		Arrays.sort(a);
		int first = 0;
		int last  = a.length-1;
		
		while(first<=last) {
			int mid = (first+last)/2;
			if(s==a[mid]) {
				return mid;
			} else if (s<a[mid]) {
				last = mid-1;
			} else if (s>a[mid]) {
				first = mid+1;
			}
		}
		return 0;
	}
}

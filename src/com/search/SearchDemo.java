package com.search;

public class SearchDemo {

	public static void main(String[] args) {
		int[] a = {9,14,3,2,43,11,58,22};  
		
		ISearch search = Factory.getSearchType("Linear");
		System.out.println("Location : "+search.search(a, 11));

		search = Factory.getSearchType("Binary");
		System.out.println("Location : "+search.search(a, 43));
	}
}

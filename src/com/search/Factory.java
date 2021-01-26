package com.search;

public class Factory {

	public static ISearch getSearchType(String search) {
		if (search.equalsIgnoreCase("LINEAR")) {
			return new LinearSearch();
		} else if (search.equalsIgnoreCase("BINARY")) {
			return new BinarySearch();
		} else {
			return null;
		}
	} 
}

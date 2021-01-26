package com.collections.comparable;

import java.util.Comparator;

public class TrekByName implements Comparator<Trek>{

	@Override
	public int compare(Trek t1, Trek t2) {
		return t1.getName().compareTo(t2.getName());
	}

}

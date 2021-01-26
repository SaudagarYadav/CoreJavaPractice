package com.collections.comparable;

import java.util.Comparator;

public class TrekByHeight implements Comparator<Trek>{

	@Override
	public int compare(Trek o1, Trek o2) {
		return o1.getId()-o2.getId();
	}

}

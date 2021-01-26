package com.java8.prdeicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.collections.comparable.Trek;

public class PredicateMain {

	public static void main(String[] args) {
		filterUsingPredicate();
	}

	private static void filterUsingPredicate() {
		Predicate<Trek> heightPredicate = (t) -> t.getHeight()<=12999; // height less or equal to 12999
		Predicate<Trek> namePredicate = (t) -> 'H' == t.getName().charAt(0); // Name should start by 's'
		
		
		List<Trek> list = new ArrayList<Trek>();
		list.add(new Trek(3, 13000, "Hampta pass"));
		list.add(new Trek(2, 12000, "Kadarkantha"));
		list.add(new Trek(5, 18000, "Rupin pass"));
		list.add(new Trek(1, 11000, "Kedeartal"));
		list.add(new Trek(4, 43000, "Kalsubai"));
		
		list.forEach(t -> {
			if (heightPredicate.or(namePredicate).test(t)) {
				System.out.println(t);
			}
		});
	}

}

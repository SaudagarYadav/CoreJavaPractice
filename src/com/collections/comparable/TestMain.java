package com.collections.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		List<Trek> list = new ArrayList<Trek>();
		list.add(new Trek(3, 13000, "Hampta pass"));
		list.add(new Trek(2, 12000, "Kadarkantha"));
		list.add(new Trek(5, 18000, "Rupin pass"));
		list.add(new Trek(1, 11000, "kedeartal"));
		list.add(new Trek(4, 43000, "Kalsubai"));
		
		System.out.println("-------------- Acutal data ----------");
		printList(list);
		
		Collections.sort(list);
		System.out.println("-------------- Sort by id ----------");
		printList(list);

		Collections.sort(list, new TrekByName());
		System.out.println("-------------- Sort by name ----------");
		printList(list);
		
		Collections.sort(list, new TrekByHeight());
		System.out.println("-------------- Sort by height ----------");
		printList(list);

		Collections.sort(list, (s1,s2) ->{
			return s1.getId()-s2.getId();
		});
		System.out.println("-------------- Sort by Id ----------");
		printList(list);
		
		
	}

	private static void printList(List<Trek> list) {
		list.forEach(l->System.out.println(l.getId() +" | " + l.getHeight() +" | " + l.getName() ));
	}
	
	
}

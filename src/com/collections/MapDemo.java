package com.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class MapDemo {

	public static void identityHashMapDemo() {
		Map<String, String> iMap = new IdentityHashMap<String, String>();
		iMap.put("1", "Sauadgar");
		iMap.put(new String("1"), "Amir");
		System.out.println("-------Identity hash map-------");
		iMap.forEach((k,v)-> System.out.println(k+":"+v));
		
	}
	
	public static void hashMapDemo() {
		Map<String, String> hMap = new HashMap<String, String>();
		hMap.put("1", "Sauadgar");
		hMap.put(new String("1"), "Amir");
		System.out.println("-------Hash map------");
		hMap.forEach((k,v)-> System.out.println(k+":"+v));
	}
	
	public static void main(String[] args) {
		identityHashMapDemo();
		hashMapDemo();
		weakHashMapDemo();
	}

	private static void weakHashMapDemo() {
		Map<String, String> wMap = new WeakHashMap<String, String>();
		String a = new String("Demo");
		wMap.put(a, "Sauadgar");
		
		Map<String, String> hMap = new HashMap<String, String>();
		wMap.put(a, "Sauadgar");

		a= null;

		System.out.println("-------Weak Hash map------");
		wMap.forEach((k,v)-> System.out.println(k+":"+v));
		
		System.out.println("-------Hash map------");
		hMap.forEach((k,v)-> System.out.println(k+":"+v));
	}
	
	
}

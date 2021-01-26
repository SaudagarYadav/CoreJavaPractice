package com.collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapTestMain {

	public static void main(final String[] args) {
		final Map<String, String> map = new HashMap<String, String>();
		map.put("sat", "dsd");
		map.put("sdsfat", "dsdfsdsd");
		map.put("sdfsdat", "dssdfd");
		
		final Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) 
        { 
             final Map.Entry<String, String> entry = itr.next(); 
             System.out.println("Key = " + entry.getKey() +  
                                 ", Value = " + entry.getValue()); 
        } 
				
	}
}

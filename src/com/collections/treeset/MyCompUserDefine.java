package com.collections.treeset;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class MyCompUserDefine {
	 
    public static void main(String a[]){
        //By using name comparator (String comparison)
        TreeSet<Empl> nameComp = new TreeSet<Empl>(new MyNameComp());
        nameComp.add(new Empl("Ram",3000));
        nameComp.add(new Empl("Ram",30400));
        nameComp.add(new Empl("Crish",2000));
        nameComp.add(new Empl("Tom",2400));
        
        for(Empl e:nameComp){
            System.out.println(e);
        }
        System.out.println("===========================");
        //By using salary comparator (int comparison)
        TreeSet<Empl> salComp = new TreeSet<Empl>(new MySalaryComp());
        salComp.add(new Empl("Ram",3000));
        salComp.add(new Empl("John",3000));
        salComp.add(new Empl("Tom",2000));
        salComp.add(new Empl("Tom",2400));
        for(Empl e:salComp){
            System.out.println(e);
        }
        
        Map<Empl, Integer> map = new HashMap<Empl, Integer>();
        map.put(new Empl("Ram",3000), 1);
        map.put(new Empl("Ram",3000), 2);
        map.put(new Empl("Tom",2400), 3);
        
        map.forEach((k,v)->System.out.println(v));
    }
}
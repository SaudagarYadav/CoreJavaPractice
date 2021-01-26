package com.nested;

public class Outer {

	String s = "amir";
	
	class Inner {
		 public void msg() {
			 s= "sauadgar";
			 System.out.println("Inner : "+s);
			 
		 }
	}
	
	 public void msg() {
		 System.out.println("Outer : "+ s);
	 }
	
	public static void main(String[] args) {
		
		Outer o = new Outer();
		o.msg();
		
		Outer.Inner i = new Outer().new Inner();
		i.msg();
		
		
	}
}

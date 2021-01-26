package com.nested;

public class StaticNested {

	static int a = 10; 
	static class Inner{
		public void msg(){
			System.out.println("inner : " + a);
		}
	}
	
	public void msg(){
		System.out.println("outer");
	}
	
	public static void main(String[] args) {
		StaticNested.Inner i = new StaticNested.Inner();
		i.msg();
		
	}
}

package com.core;

public class Child extends Parent{
	
	public static void test(){
		System.out.println("Test child");
	}
	
	@Override
	public void test1() {
		System.out.println("Test1 child");
	} 
}

package com.nested;

public class Anonymous {

	public void msg() {
		System.out.println("Outer");
	}
	
	
	public static void main(String[] args) {
		Anonymous a = new Anonymous();
		a.msg();
		
		Anonymous i = new Anonymous() {
			public void msg() { 
				System.out.println("inner");
			}
		};
		i.msg();
		
	}
}

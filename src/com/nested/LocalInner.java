package com.nested;


class LocalInner {

	int a=10;
	public void msg() {
		final int b = 20; 
		class Inner {
			public void test() {
				System.out.println(a*b);
			}
		}
		
		Inner inner = new Inner();
		inner.test();
		
	}
	
	public static void main(String[] args) {
		LocalInner inner = new LocalInner();
		inner.msg();
	}
}

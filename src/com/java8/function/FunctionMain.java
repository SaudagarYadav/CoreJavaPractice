package com.java8.function;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.collections.comparable.Trek;

public class FunctionMain {

	public static void main(String[] args) {
		
		functionTest();
		
	}

	private static void functionTest() {
		
		Function<String, String> f = FunctionMain::test;
		System.out.println(f.apply("saudagar"));
		
		UnaryOperator<String> u = (t) -> t.toUpperCase();
		System.out.println(u.apply("sauadagr"));
		
		BiFunction<String, String, String> f1 = FunctionMain::test1;
		System.out.println(f1.apply("Sauadgar", " Yadav"));
		
		Supplier<Trek> s= Trek::new;
		
	}
	
	public static String test (String S) {
		return S.concat(S);
	}
	public static String test1 (String S,String S1) {
		return S.concat(S1).toUpperCase();
	}
}

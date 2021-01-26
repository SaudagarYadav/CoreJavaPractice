package com.designPattern.builder;

import java.util.Date;

public class DesignPatternMain {

	public static void main(String[] args) {

		// Normal flow
		Trek trek = new Trek("Kalsubai", 2, 3);
		System.out.println(trek);
		
		// Builder pattern
		Trek trek2 = new TrekBuilder("sauadagr").getTrek();
		System.out.println(trek2);
		trek2 = new TrekBuilder("sauadagr",2).getTrek();
		System.out.println(trek2);
		trek2 = new TrekBuilder("sauadagr",2,3).getTrek();
		System.out.println(trek2);
	}

}

package com.designPattern.builder;

import java.util.Date;

public class TrekBuilder {

	private String name;
	private int days;
	private int level;
	
	public TrekBuilder(String name) {
		super();
		this.name = name;
	}

	public TrekBuilder(String name, int days) {
		super();
		this.name = name;
		this.days = days;
	}
	
	public TrekBuilder(String name, int days, int level) {
		super();
		this.name = name;
		this.days = days;
		this.level = level;
	}

	public Trek getTrek() {
		return new Trek(name, days, level);
	}
	
}

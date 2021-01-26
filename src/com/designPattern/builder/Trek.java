package com.designPattern.builder;

import java.util.Date;

public class Trek {

	private String name;
	private int days;
	private int level;
	public Trek(String name, int days, int level) {
		super();
		this.name = name;
		this.days = days;
		this.level = level;
	}
	@Override
	public String toString() {
		return "Trek [name=" + name + ", days=" + days + ", level=" + level + "]";
	}
	
	
	
}

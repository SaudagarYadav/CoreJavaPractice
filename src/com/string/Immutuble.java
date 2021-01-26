package com.string;

public final class Immutuble {

	private final int id;

	private Immutuble(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public static Immutuble getInstance(int id) {
		return new Immutuble(id);
	}
	
}

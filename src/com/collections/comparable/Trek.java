package com.collections.comparable;

public class Trek implements Comparable<Trek>{
	private int id;
	private int height;
	private String name;
	
	public Trek() {}
	public Trek(int id, int height, String name) {
		this.id = id;
		this.height = height;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Trek o) {
		if(id<o.id) {
			return -1;
		} else  {
			return 1;
		}
	}

	@Override
	public String toString() {
		return "Trek [id=" + id + ", height=" + height + ", name=" + name + "]";
	}
}

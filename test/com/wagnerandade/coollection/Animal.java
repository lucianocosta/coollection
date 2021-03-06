package com.wagnerandade.coollection;

public class Animal {

	private final String name;
	private final Integer age;
	private final boolean live;
	private String scientificName;
	private String color;

	public Animal(String name, Integer age) {
		this.name = name;
		this.age = age;
		this.live = true;
	}
	
	public Animal(String name, int age, String scientificName) {
		this(name, age);
		this.scientificName = scientificName;
	}

	public String name() {
		return name;
	}

	public int age() {
		return age;
	}

	public boolean isLive() {
		return live;
	}
	
	public String getScientificName() {
		return scientificName;
	} 
	
	public String getColor() {
		return color;
	}

	public void setColor(String c) {
		this.color = c;
	}

}
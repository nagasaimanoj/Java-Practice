package com.manoj;

public class HelloWorld {
	private String name;
	private String town;

	public HelloWorld() {
	}

	public void setName(String temp) {
		name = temp;
	}

	public void setTown(String temp) {
		town = temp;
	}

	public String getName() {
		return name;
	}

	public String getTown() {
		return town;
	}

	public void printHello() {
		System.out.println(name + " ----- " + town + "\t");
	}
}
package com.manoj;

public class HelloWorld {
	private String name;

	public void setName(String temp) {
		this.name = temp;
	}

	public String getName() {
		return this.name;
	}

	public void printHello() {
		System.out.println("Hello ! " + this.name);
	}
}
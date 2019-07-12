package com.pack.springdemo;

public class Manager {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + "]";
	}
	public void abc() {
		System.out.println("object invoked");
	}
	public void xyz() {
		System.out.println("object destroyed");
	}

}

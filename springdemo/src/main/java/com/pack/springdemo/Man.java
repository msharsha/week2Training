package com.pack.springdemo;

public class Man implements Human{
	private String name;
	private int age;
	private Address address;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	


	public Man(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}



	@Override
	public String toString() {
		return "Man [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}

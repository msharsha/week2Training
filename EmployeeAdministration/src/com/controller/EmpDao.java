package com.controller;

public interface EmpDao {
	
	public boolean adminSearch(Employee e);
	public Employee searchById(Employee e);
	public boolean insert(Employee e);
	public void update();
	public void delete();
	public void display();
}

package com.rakuten.training.lamdas;

public class Employee {
	
	int id;
	String firstName;
	String lastName;
	double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

}

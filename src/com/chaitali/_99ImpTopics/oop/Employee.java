package com.chaitali._99ImpTopics.oop;

// encapsulation - binding data and code together 

// abstraction - minimum necessary representation 
// inheritance - subclass inherits members of super class 

class Animal {

	int numberOfLegs;
	String typeOfFood;
	
	void sound() {
		
	}

}

class Dog extends Animal {

}

class Cat extends Animal {

}

class BankCustomer {

	private double balance;

	double withdraw(double amount) { // setter
		balance -= amount;
		return balance;
	}

	double deposit(double amount) { // setter
		balance += amount;
		return balance;
	}

	double viewBalance() { // getter
		return balance;
	}

}

// create model classes like this 

public class Employee {

	private int eid;
	private String firstName;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(String firstName, double salary) {
		super();
		this.firstName = firstName;
		this.salary = salary;
	}

	public Employee(int eid, String firstName, double salary) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}

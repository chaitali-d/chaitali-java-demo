package com.chaitali._99ImpTopics;

public class Employee {

	int eid;
	String firstName;
	double salary;

	public Employee() {
		super();
		System.out.println("Default constructor");
	}

	public Employee(int eid, String firstName) {
		super();
		this.eid = eid;
		this.firstName = firstName;
	}

	public Employee(int eid, String firstName, double salary) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}

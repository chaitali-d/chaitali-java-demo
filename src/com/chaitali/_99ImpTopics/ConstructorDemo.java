package com.chaitali._99ImpTopics;

public class ConstructorDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.eid = 101;
		emp.firstName = "Sonu";
		emp.salary = 50000;
		System.out.println(emp.toString());

		Employee emp2 = new Employee();
		emp2.eid = 102;
		emp2.firstName = "Monu";
		emp2.salary = 55000;
		System.out.println(emp2.toString());

		Employee emp3 = new Employee(103, "Tonu", 60000);
		System.out.println(emp3.toString());

		Employee emp4 = new Employee(104, "Ponu");
		System.out.println(emp4.toString());
	}

}

package com.chaitali._99ImpTopics.oop;

public class EncapDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
//		emp.salary = 101;
		emp.setSalary(1000);
		System.out.println(emp.getSalary());
		
		Dog myDog = new Dog();
		myDog.typeOfFood = "Biscuits";
		

	}

}

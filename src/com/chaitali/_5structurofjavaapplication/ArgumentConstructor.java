package com.chaitali._5structurofjavaapplication;

//call non static variable 
//here we use argument constructor
public class ArgumentConstructor {
	int eId;
	String eName;

	public ArgumentConstructor(int eId, String eName) {

		this.eId = eId;
		this.eName = eName;

	}

	public static void main(String[] args) {

		ArgumentConstructor e1 = new ArgumentConstructor(101, "Bc");
		ArgumentConstructor e2 = new ArgumentConstructor(102, "Cd");
		System.out.println(e1.eId + e1.eName);
		System.out.println(e2.eId + e2.eName);

	}

}

package com.chaitali._5structurofjavaapplication;

public class NoArgumentNoReturn {

	static int i;

	public static void main(String[] args) {

		System.out.println(NoArgumentNoReturn.i);
		NoArgumentNoReturn.initialize();
		System.out.println(NoArgumentNoReturn.i);

	}

	static void initialize() {
		NoArgumentNoReturn.i = 100;
	}

}

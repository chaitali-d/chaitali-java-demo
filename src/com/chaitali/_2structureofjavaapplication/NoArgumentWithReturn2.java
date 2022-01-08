package com.chaitali._2structureofjavaapplication;

public class NoArgumentWithReturn2 {
	static int i;
	
	
	public static void main(String[] args) {
		NoArgumentWithReturn2.i=NoArgumentWithReturn2.initialize();
		System.out.println(NoArgumentWithReturn2.i);
		
	}
	
	static int initialize() {
		
		System.out.println(NoArgumentWithReturn2.i);
		return 100;
		
	}

}

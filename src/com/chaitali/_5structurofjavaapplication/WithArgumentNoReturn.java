package com.chaitali._5structurofjavaapplication;

public class WithArgumentNoReturn {
	
	static int i;
	public static void main(String[] args) {
		WithArgumentNoReturn.initilize(100);
		System.out.println(WithArgumentNoReturn.i);
		
	}

	 static void initilize(int i)
	 {
		
		 WithArgumentNoReturn.i=i;
		 
	 }	
}

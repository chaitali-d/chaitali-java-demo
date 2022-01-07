package com.chaitali._5structurofjavaapplication;

public class ThisKeyword {
	
	static {
		
//		System.out.println(this);//error because this keyword is used onle in the non static block
		
	}
	{
		
		System.out.println(this);// non static block
		
	}
}

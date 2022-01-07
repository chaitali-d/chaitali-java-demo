package com.chaitali._5structurofjavaapplication;

public class CreatObjectInsideMainMethod {
	
	int i;
	CreatObjectInsideMainMethod(){
		System.out.println("constructor");// it is use to initiliaze non static variable
	
	}
	{
		System.out.println("non static block");
		
	}
	
	static {
		
		System.out.println("static block");
		
	}
	public static void main(String[] args) {
		new CreatObjectInsideMainMethod() ;
;		
	}
	

}

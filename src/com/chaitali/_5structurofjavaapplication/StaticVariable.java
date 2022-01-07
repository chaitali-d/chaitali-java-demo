package com.chaitali._5structurofjavaapplication;

class Programm{
	
	static int j=20;
	
}


public class StaticVariable {
		
		static int i=10;
		
		public static void main(String[] args) {
			int i=20;
			System.out.println(i);
			System.out.println(StaticVariable.i);
			System.out.println(Programm.j);   //static variables can be accessed by class name .variable name
		}
		
		
		
	}
	
	
	
	

package com.chaitali._5structurofjavaapplication;

public class ConsolidetedProgramm {
	int i=10;
	static int j=20;
       static {
    	   
    	System.out.println("static block");   
       }
       {
    	   
    	System.out.println("non static block");   
    	   
       }
       
	public static void main(String[] args) {
	ConsolidetedProgramm obj = new ConsolidetedProgramm();
	System.out.println(ConsolidetedProgramm.m2());
	System.out.println(obj.m1());
	System.out.println(obj.i);
	System.out.println(ConsolidetedProgramm.j);

	}
	
	   int m1()
	   {
	ConsolidetedProgramm obj1 = new ConsolidetedProgramm();	   
		System.out.println(ConsolidetedProgramm.m2());
		System.out.println(obj1.i);
		System.out.println(ConsolidetedProgramm.j);
		return i+j;
		   
	   }	
	   
	   static int m2()
	   {
		ConsolidetedProgramm obj2 = new ConsolidetedProgramm();   
		   return ConsolidetedProgramm.j + obj2.i;
	   }
}

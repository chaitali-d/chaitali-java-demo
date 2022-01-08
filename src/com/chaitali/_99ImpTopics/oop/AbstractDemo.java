package com.chaitali._99ImpTopics.oop;

abstract class Abs {

	abstract void m1();

//	abstract void m2();

	void m3() {

	}

//	void m4() {
//
//	}
}

class ConcreteClass extends Abs {

	@Override
	void m1() {
		System.out.println("m1 implemented");
	}

//	@Override
//	void m2() {
//		// TODO Auto-generated method stub		
//	}

}

interface FinanceMInistry {

	public abstract void m5();

	public abstract void m6();

}

interface StateGovt {
	
	public abstract void m7();

	public abstract void m8();

}

// concrete class - normal class 
abstract class Rbi {

//	abstract method - only signature 
	abstract void doKyc();

//	// concrete method - signature + body
	void payInterestOnDeposits() // Signature - what does this method do?
	{ // body - how does it do it?
		System.out.println("Please pay interest on deposits.");
	}

}

class HdfcBank extends Rbi implements FinanceMInistry, StateGovt {

	@Override
	void doKyc() {
		// TODO Auto-generated method stub

	}

}

public class AbstractDemo {

	public static void main(String[] args) {
		ConcreteClass obj = new ConcreteClass();
		obj.m1();

	}

}

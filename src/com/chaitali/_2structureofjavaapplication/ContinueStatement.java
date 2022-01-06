package com.chaitali._2structureofjavaapplication;

public class ContinueStatement {
	public static void main(String[] args) {
		int i=2;
		for(i=2;i<10;i++) {
			
			if(i==4) {
				continue;
			}
			System.out.println(i);
		}
	}

}

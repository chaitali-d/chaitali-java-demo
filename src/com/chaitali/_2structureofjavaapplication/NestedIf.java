package com.chaitali._2structureofjavaapplication;

public class NestedIf {
	public static void main(String[] args) {
		int mood=1;
		int friends=1;
		if(mood==1) {
			  if(friends==1) {
				  System.out.println("Go to movie..");
			  }
			  else {
				  System.out.println("Go to shopping");
			  }
			  else {
				  
				  if(friends==1) {
					  System.out.println("Go to sleep..");
				  }
				  else {
					  System.out.println("watch TV");
				  }
			  }	  
			
	}

}
	}

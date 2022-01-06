package com.chaitali._3arrayofjava;
//to store 10 to 50 elements in array 
public class ArrayDemo {
	public static void main(String[] args) {
		int a []=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        
        for(int i = 0;i<a.length;i++) {
        	System.out.println(a[i]);
        	
        }
        //to store string values.
        String  b[]= {"raj","mom","tony"};
        
        for(int i=0;i<b.length;i++) {
        	
        	System.out.println(b[i]);
        }
	}

}

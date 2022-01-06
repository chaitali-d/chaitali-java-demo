package com.chaitali._3arrayofjava;

public class MultidimensionalArray {

	public static void main(String[] args) {

		int[][] twoDarray = { { 1, 2, }, { 5, 6, } };

		for (int[] outerArray : twoDarray) {

			for (int elements : outerArray) {

				System.out.println(elements);

			}

		}
	}

}

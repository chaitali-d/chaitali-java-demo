package com.chaitali._5structurofjavaapplication;

public class RailwaySeat {
	public static void main(String[] args) {
		int s = 1;
		if (s > 0 && s < 73) {
			if (s % 8 == 1 || s % 8 == 4) {
				System.out.println("lower berth");
			} else if (s % 8 == 2 || s % 8 == 5) {
				System.out.println("middel birth");
			} else if (s % 8 == 3 || s % 8 == 6) {
				System.out.println("upper birth");
			} else if (s % 8 == 7) {
				System.out.println("side lower birth");
			} else {

				System.out.println("side upper birth");
			}

//			else {
			System.out.println("invallid birth");

//			}

		}
	}

}

package com.capg.codingpractice;

public class DivisbleBy7 {

	public static String checkDivisibleBy7(int n) {
		if (n % 7 == 0) {
			return "Yes";
		} else {
			return "No";
		}
	}

	public static void main(String[] args) {

		System.out.println(checkDivisibleBy7(434));
	}
}

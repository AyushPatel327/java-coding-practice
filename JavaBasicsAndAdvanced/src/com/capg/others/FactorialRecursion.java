package com.capg.others;

public class FactorialRecursion {

	public static int factorial(int num) {

		if (num == 0 || num == 1)
			return 1;
		else {
			return num * factorial(num - 1);
		}

	}

	public static void main(String[] args) {
		System.out.println("factorial is: " + factorial(5));

	}

}

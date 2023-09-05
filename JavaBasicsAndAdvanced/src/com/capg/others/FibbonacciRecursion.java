package com.capg.others;

public class FibbonacciRecursion {

	public static void printFibbonacciNumber(int num1, int num2, int count) {
		if (count == 0)
			return;

		System.out.println(num1 + num2 + " ");

		printFibbonacciNumber(num2, num1 + num2, --count);

	}

	public static void main(String[] args) {

		printFibbonacciNumber(0, 1, 10);
	}

}

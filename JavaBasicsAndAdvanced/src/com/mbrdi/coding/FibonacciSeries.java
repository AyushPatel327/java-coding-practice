package com.mbrdi.coding;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0 1 1 2 3 5
		int num1 = 1;
		int num2 = 1;

		int sum = 0;
		System.out.print(1 + " ");
		while (num2 < 30) {
			sum = num2 + num1;
			num1 = num2;
			num2 = sum;
			if (sum > 30) {
				break;
			}
			System.out.print(num2 + " ");
		}
	}

}

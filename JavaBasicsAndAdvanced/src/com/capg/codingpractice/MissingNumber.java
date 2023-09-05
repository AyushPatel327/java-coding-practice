package com.capg.codingpractice;

public class MissingNumber {

	public static void main(String[] args) {
		// int numbers[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

		// int numbers[] = { 2, 4, 6, 10, 12, 14, 16, 18, 20 };

		int numbers[] = { 1, 3, 5, 9, 11, 13, 15, 17 };

		String missingNumbers = "";

		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] != (numbers[i] + numbers[i + 1]) / 2) {
				missingNumbers = missingNumbers + (numbers[i] + numbers[i + 1]) / 2 + " ";
			}
		}

		System.out.println(missingNumbers);

	}

}

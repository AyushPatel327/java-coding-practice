package com.capg.Arrays;

public class MissingIntegerInArray {

	public static int find(int[] arr, int number) {

		for (int i = arr.length - 1, n = number; i > 0 && n > 0; i--, n--) {
			if (arr[i] != n) {
				return n;
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 5, 6 };
		int n = 6;

		System.out.println("Missing Number is : " + find(arr, n));
	}
}

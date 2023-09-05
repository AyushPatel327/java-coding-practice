package com.capg.Arrays;

public class FindPairs {

	public static void findPairs(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum)
					System.out.println("Pair: (" + arr[i] + "," + arr[j] + ")");
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 5, -1, 7, 0, 6 };
		int sum = 6;

		findPairs(arr, sum);

	}

}

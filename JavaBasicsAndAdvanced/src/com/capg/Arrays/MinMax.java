package com.capg.Arrays;

import java.util.Arrays;

public class MinMax {

	public static int[] sortArray(int arr[]) {
		Arrays.sort(arr);
		return arr;
	}

	public static int findMin(int[] arr) {
		sortArray(arr);
		return arr[0];
	}

	public static int findMax(int[] arr) {
		sortArray(arr);
		return arr[arr.length - 1];
	}

	public static int findMinByStream(int[] arr) {

		return Arrays.stream(arr).min().getAsInt();
	}

	public static void main(String[] args) {
		int[] arr = { 46, 16, 34, 73, 10, 99, 9 };
		System.out.println(findMin(arr));
		System.out.println(findMax(arr));
		System.out.println(findMinByStream(arr));

	}

}

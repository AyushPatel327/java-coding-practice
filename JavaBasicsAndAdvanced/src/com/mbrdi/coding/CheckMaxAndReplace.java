package com.mbrdi.coding;

public class CheckMaxAndReplace {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 10, 5, 1, 2 };
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int max = -1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					max = arr[j];
						break;
				}

			}
			output[i] = max;
			System.out.print(output[i] + " ");
		}

	}

}

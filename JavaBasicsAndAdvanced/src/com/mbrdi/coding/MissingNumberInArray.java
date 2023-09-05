package com.mbrdi.coding;

public class MissingNumberInArray {

	public static void findMissingNumner(int a[]) {
		String missingNumbers = "";

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != (a[i] + a[i + 1]) / 2) {
				missingNumbers = missingNumbers + (a[i] + a[i + 1]) / 2 + " ";
			}
		}

		System.out.println(missingNumbers);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 7, 8, 9, 10 };
		findMissingNumner(arr);

	}

}

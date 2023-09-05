package com.mbrdi.coding;

public class SmallestAndLargestElementInArray {

	public static int findSmallest(int a[]) {
//through Arrays.sort() method
//	Arrays.sort(a);
//		return a[0];

		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;

	}

	public static int findLargest(int a[]) {
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int ar[] = { 44, 77, 15, 20, 83, 97, 9, 110 };
		System.out.println("Smallest element in array: " + findSmallest(ar));
		System.out.println("Largest element in array: " + findLargest(ar));

		
	}

}

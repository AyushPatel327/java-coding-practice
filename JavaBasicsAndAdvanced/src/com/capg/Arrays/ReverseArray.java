package com.capg.Arrays;

import java.util.stream.IntStream;

public class ReverseArray {

	public static int[] reverseArray(int[] arr) {

		 int[] temp = new int[arr.length];
		for (int i = arr.length-1 , j = 0; i >= 0 && j < arr.length; i--, j++) {
			temp[j] = arr[i];
		}
		return temp;

	}
	public static int[] reverseArrayByStream(int[] arr) {
		
	return	IntStream.range(0, arr.length).map(i -> arr[arr.length-i-1]).toArray();
	}

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4 };

		for (int i : reverseArrayByStream(ar)) {
			System.out.print(i);
		}
		
		

	}

}

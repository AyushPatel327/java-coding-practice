package com.capg.Arrays;

import java.util.Arrays;

public class ArrayComparison {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		
		System.out.println("Compare using equals method " + Arrays.equals(arr, arr2));
		System.out.println("compare through '==' " + (arr==arr2));

	}

}

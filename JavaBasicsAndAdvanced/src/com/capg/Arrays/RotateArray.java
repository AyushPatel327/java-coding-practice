package com.capg.Arrays;

public class RotateArray {

	public static int[] rotate(int[] arr) {
		int x = arr[arr.length-1];
		for(int i=arr.length-1; i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = x;
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		rotate(arr);
		for (int i : arr) {
			System.out.print(i);
		}
		
		

	}

}

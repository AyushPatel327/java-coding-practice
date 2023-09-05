package com.mbrdi.coding;

public class ReverseNumber {

	public static int reverseNumber(int n) {
		String result = "";
		while (n != 0) {
			int x = n % 10;
			result += x;
			n = n / 10;
		}
		return Integer.parseInt(result);

	}

	public static void main(String[] args) {
		System.out.print(reverseNumber(123));

	}

}

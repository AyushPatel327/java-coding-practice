package com.mbrdi.coding;

public class LShapeStar {

	public static void main(String[] args) {
		int n = 6;
		for (int i = 1; i <= n; i++) {
			int k = n;
			if (i != n) {
				k = 1;
			}

			// when i and j becomes equal to n then it
			// will print stars n times
			for (int j = 1; j <= k; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

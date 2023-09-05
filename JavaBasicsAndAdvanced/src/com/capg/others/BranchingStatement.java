package com.capg.others;

public class BranchingStatement {

	public static void main(String[] args) {
		int n = 10;

		/*
		 * while (n > 0) { System.out.println(n); n--; }
		 */

		outer: for (int i = 0; i < 10; i++) {
			System.out.print("i: " + i + "=> ");
			for (int j = 0; j < 10; j++) {
				if (j == 6 && i == 6)
					break outer;
				else {
					System.out.println("j: " + j);
				}
			}
		}
	}
}

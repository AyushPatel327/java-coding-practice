package com.capg.codingpractice;

public class PerfectNumber {

	public static void checkPerfectNumber(int n) {
		int sum = 0;
		// boolean flag = true;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}

		}
		if (sum == n) {
			System.out.println("perfect number " + n);
		}
		// 6 = 1+2+3
	}

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		for (int i = 1; i <= 100; i++)
			checkPerfectNumber(i);

	}

}

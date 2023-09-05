package com.capg.codingpractice;

import java.util.List;

public class SquareOfPrimeNumbers {

	public static boolean isPrime(int n) {
		boolean flag = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0 || n == 9) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(2, 4, 2, 1, 9, 4);

//		System.out.println(isPrime(37) ? "Is Prime" : "Not Prime");

		numbers.stream().filter(n -> isPrime(n)).map(s -> s * s).forEach(System.out::println);

	}

}

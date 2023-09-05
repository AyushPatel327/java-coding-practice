package com.capg.codingpractice;

import java.util.Arrays;

public class ThirdHighest {

	public static void main(String[] args) {
		int list[] = { 24, 15, 88, 65, 13, 34 };

		Arrays.sort(list);
		System.out.println("Third Highest " + list[list.length - 3]);

	}

}

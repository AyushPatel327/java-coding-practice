package com.mbrdi.coding2;

import java.util.List;

public class SquareOfDistinctNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(22, 12, 20, 12, 22, 40, 44);

		
		numbers.stream().distinct().map((m)-> m*m).forEach(System.out::println);
		
		
	}

}

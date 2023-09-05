package com.mbrdi.coding2;

import java.util.List;

public class DuplicateIntegersInList {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(62,27,12,98,62,56,10,55,12);
		
		numbers.stream().distinct().sorted().forEach(System.out::println);
		
		System.out.println("First Element: "+numbers.stream().findFirst().orElse(0));
		
		
		System.out.println(numbers.stream().count());
		}

}

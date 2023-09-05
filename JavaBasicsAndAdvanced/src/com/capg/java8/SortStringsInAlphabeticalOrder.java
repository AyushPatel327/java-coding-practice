package com.capg.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsInAlphabeticalOrder {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("java", "ape", "zone", "parking");

		System.out.println("Ascending order: " + list.stream().sorted().collect(Collectors.toList()));
		
		System.out.println("Descending order: " + list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
	}

}

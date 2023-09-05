package com.mbrdi.coding2;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class RepeatedNumbers {

	public static void main(String[] args) {
	List<Integer> numbers = List.of(2,3,3,4,5,5,4,3,3,3,6 );
	
	
	numbers.stream().collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting())).entrySet().forEach(System.out::println);

	}

}

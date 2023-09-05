package com.capg.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctElementsInList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(23, 88, 88, 11, 9, 87, 60, 23, 11);
		List<Integer> newList = list.stream().distinct().toList();

		System.out.println("Distinct elements are: ");
		for (Integer integer : newList) {
			System.out.print(integer + " ");
		}
		
		System.out.println();
		
		Set<Integer> set = new HashSet<>();
		
		set.add(12);
		set.add(45);
		set.add(32);
		set.add(99);
		set.add(12);
		
	//	set.addAll(newList);

		
		System.out.println("Distinct elements of set are: ");
		for (Integer integer : set) {
			System.out.print(integer + " ");
		}
		
		System.out.println("\nElements of set in sorted order: ");
		set.stream().sorted().forEach(System.out::println);

		
		
		
	}

}

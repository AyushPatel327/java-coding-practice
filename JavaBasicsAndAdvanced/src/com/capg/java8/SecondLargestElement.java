package com.capg.java8;

import java.util.Arrays;
import java.util.List;

public class SecondLargestElement {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(23,13,37,46,10,19,58,99,30);
		
		System.out.println("Second smallest element: " + list.stream().sorted().toList().get(1));
		
		System.out.println("Largest element: " + list.stream().mapToInt(Integer::valueOf).max().getAsInt());
	}

}

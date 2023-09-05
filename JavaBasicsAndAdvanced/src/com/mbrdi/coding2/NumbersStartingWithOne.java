package com.mbrdi.coding2;

import java.util.List;

public class NumbersStartingWithOne {

	public static void main(String[] args) {
		
		List<Integer>  numbers = List.of(23,11,21,131,101,90,67);

		//System.out.println(numbers.get(0).toString());
		numbers.stream().filter((s)->s.toString().charAt(0) == '1' ).forEach(System.out::println);
	}

}

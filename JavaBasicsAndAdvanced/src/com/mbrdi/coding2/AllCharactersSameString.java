package com.mbrdi.coding2;

import java.util.List;

public class AllCharactersSameString {

	public static void main(String[] args) {

		List<String> list = List.of("you", "exe", "ooo", "xyz", "zzz");

		list.stream().filter(s -> s.chars().distinct().count() == 1).forEach(System.out::println);

	}

}

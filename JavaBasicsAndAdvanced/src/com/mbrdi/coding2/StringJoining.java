package com.mbrdi.coding2;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoining {

	public static void main(String[] args) {
		List<String> list = List.of("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		StringJoiner joiner = new StringJoiner(",");

		List<String> newList = list.stream().map((a) -> a.toUpperCase().concat("")).collect(Collectors.toList());

		System.out.println(newList);
	}

}

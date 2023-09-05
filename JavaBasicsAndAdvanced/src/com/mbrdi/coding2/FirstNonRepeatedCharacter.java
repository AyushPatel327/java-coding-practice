package com.mbrdi.coding2;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String s = "ahahsjidh";
		char first = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).map(t -> t.getKey()).findFirst()
				.orElseThrow(() -> new RuntimeException());

		System.out.println(first);
	}

}

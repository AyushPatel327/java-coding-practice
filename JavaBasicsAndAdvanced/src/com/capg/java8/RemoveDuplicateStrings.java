package com.capg.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateStrings {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();

		strings.add("hello");
		strings.add("Vena");
		strings.add("capgemIni");
		strings.add("thiS");
		strings.add("Vena");
		strings.add("Vena");
		strings.add("hello");

		System.out.println(strings.stream().distinct().collect(Collectors.toList()));

	}

}

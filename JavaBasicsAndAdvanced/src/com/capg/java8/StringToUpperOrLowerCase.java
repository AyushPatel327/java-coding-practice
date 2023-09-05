package com.capg.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperOrLowerCase {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();

		strings.add("hello");
		strings.add("Vena");
		strings.add("capgemIni");
		strings.add("thiS");

		List<String> newList = strings.stream().map((s) -> s.toUpperCase()).collect(Collectors.toList());

		System.out.println(newList);

	}
}

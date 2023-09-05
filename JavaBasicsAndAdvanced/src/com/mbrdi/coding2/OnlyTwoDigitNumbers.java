package com.mbrdi.coding2;

import java.util.Arrays;
import java.util.List;

public class OnlyTwoDigitNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(22, 223, 14, 342);

		list.stream().map(s -> s.toString()).filter(t -> t.length() == 2).forEach(System.out::println);

	}

}

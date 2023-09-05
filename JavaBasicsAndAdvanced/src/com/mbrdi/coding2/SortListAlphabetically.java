package com.mbrdi.coding2;

import java.util.stream.Stream;

public class SortListAlphabetically {

	public static void main(String[] args) {
		String string[] = { "Capgemini", "Accenture", "TCS", "EPAM" };

		Stream.of(string).sorted().forEach(System.out::println);

	}

}

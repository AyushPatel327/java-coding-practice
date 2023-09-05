package com.mbrdi.coding2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountCharacterInString {

	public static void main(String[] args) {
		String str = "Capgemini";
 
		Map<Object, Long> map = Stream.of(str.split(""))
				.collect(Collectors.groupingBy(c -> c, HashMap::new, Collectors.counting()));

		System.out.println(map);
	}

}

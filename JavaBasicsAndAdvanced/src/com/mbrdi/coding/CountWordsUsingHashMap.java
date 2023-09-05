package com.mbrdi.coding;

import java.util.HashMap;
import java.util.Map;

public class CountWordsUsingHashMap {

	public static void main(String[] args) {

		String str = "This' \n is 'the best \tI gave is,";
		String[] words = str.trim().split("\\W");

		Map<String, String> map = new HashMap<>();

		for (String s : words) {
			if (map.containsValue(s)) {
				continue;
			} else {
				map.put(s, s);
			}
		}
//		Set<Map.Entry<String, String>> set = map.entrySet();
//		set.stream().map((s) -> s.getKey()).sorted().forEach(System.out::println);

		map.entrySet().stream().map((s) -> s.getValue()).sorted().forEach(System.out::println);
	}

}

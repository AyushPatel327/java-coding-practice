package com.capg.string.manipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaxOcurringCharacter {

	public static void findMaxCountChar(String str) {
		String arr[] = str.toLowerCase().split("");

		Map<String, Integer> countOccurrence = new HashMap<>();

		for (String str2 : arr) {
			if (countOccurrence.containsKey(str2))
				countOccurrence.put(str2, countOccurrence.get(str2) + 1);
			else {
				countOccurrence.put(str2, 1);
			}
		}

		// countOccurrence.entrySet().stream().map((k,v)->k);
		Set<Entry<String, Integer>> set = countOccurrence.entrySet();

		int maxCount = 0;
		String maxChar = "";
		for (Entry<String, Integer> entry : set) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxChar = entry.getKey();
			}
		}

		System.out.println("Max Char in String is " + maxChar + ":" + maxCount);

	}

	public static void main(String[] args) {
		String string = "String is Immutable";
		findMaxCountChar(string);

	}

}

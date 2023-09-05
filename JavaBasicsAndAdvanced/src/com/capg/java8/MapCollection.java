package com.capg.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 
 * @author aypatel
 * @date 19-05-2023
 * @description implentation of Map interface using HashMap and TreeMap classes
 *
 */
public class MapCollection {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(210, "ravi");
		map.put(109, "teja");
		map.put(333, "singh");

		Set<Map.Entry<Integer, String>> entries = map.entrySet();

		entries.stream().forEach((a) -> System.out.println(a.getKey() + " " + a.getValue()));
		entries.stream().filter((k) -> k.getValue().contains("e"))
				.forEach((entry) -> System.out.println(entry.getValue()));

//	Treemap
		System.out.println("TreeMap below:");
		Map<Integer, String> newMap = new TreeMap<>();

		newMap.put(109, "teja");
		newMap.put(333, "ashish");
		newMap.put(210, "ravi");
		newMap.put(null, null);

		Set<Map.Entry<Integer, String>> entriesOfTree = newMap.entrySet();

		entriesOfTree.stream().forEach((a) -> System.out.println(a.getKey() + " " + a.getValue()));

	}

}

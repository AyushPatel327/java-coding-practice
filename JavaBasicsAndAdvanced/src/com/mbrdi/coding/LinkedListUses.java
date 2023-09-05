package com.mbrdi.coding;

import java.util.LinkedList;
import java.util.List;

public class LinkedListUses {

	public static void main(String[] args) {
		List<String> strings = new LinkedList<>();
		strings.add("fox");
		strings.add("mozilla");
		strings.add("chrome");
		strings.add("fox");
		strings.add("opera");
		
		strings.removeIf((t)->t.contains("opera"));
		strings.forEach(System.out::println);
		
		
		

	}

}

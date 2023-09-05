package com.capg.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OneCollectionToOther {

	public static void main(String[] args) {
	List<String> list = Arrays.asList("ravi","kishan", "ram", "mangal");
	
	Set<String> set = new HashSet<>();
	set.add(null);
	set.add(null);
	
	set.addAll(list);
	Collections.sort(null);
	
	Iterator<String>  itr = set.iterator();

	while (itr.hasNext()) {
	System.out.println(itr.next());
		
	}
	
	Map<String,Set<String>> map = new HashMap<>();
	map.put("setKey", set);
	
	map.entrySet().forEach(System.out::println);

//	System.out.println(set);
		
	}

}

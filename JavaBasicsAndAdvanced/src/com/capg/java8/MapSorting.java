package com.capg.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapSorting {

	public static void main(String[] args) {
		
	Map<Book, Integer> bookMap = new HashMap();
		
	bookMap.put(new Book(1021, "Life of Pi", "KR"), 40);
	bookMap.put(new Book(1028, "Jungle Book", "JP"), 30);
	bookMap.put( new Book(1019, "Strangers things", "BB"), 10);
	bookMap.put(new Book(1030, "Ghosted", "AB"), 90);

	System.out.println("Comparing by Author Name");
	bookMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Book::getAuthor))).forEach(System.out::println);
	
	
	}

}

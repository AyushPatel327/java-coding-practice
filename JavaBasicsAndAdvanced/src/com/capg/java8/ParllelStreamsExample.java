package com.capg.java8;

import java.util.HashMap;
import java.util.Map;

public class ParllelStreamsExample {

	public static void main(String[] args) {
		Map<Book, Integer> bookMap = new HashMap();
		
		bookMap.put(new Book(1021, "Life of Pi", "KR"), 40);
		bookMap.put(new Book(1028, "Jungle Book", "JP"), 30);
		bookMap.put( new Book(1019, "Strangers things", "BB"), 10);
		bookMap.put(new Book(1078, "Ghosted", "AB"), 90);
		bookMap.put(new Book(1015, "Ghosted", "BA"), 50);
		bookMap.put(new Book(1099, "Ghosted", "AA"), 20);
		
		bookMap.put(new Book(1011, "Ghosted", "CC"), 30);
		
		long start = 0;
		long end =  0;

		start = System.currentTimeMillis();
		bookMap.entrySet().stream().filter((t)-> t.getKey().getAuthor().contains("A")).forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println(end-start);
		
		System.out.println("ParallelStream: ");
		start = System.currentTimeMillis();
		bookMap.entrySet().parallelStream().filter((t)-> t.getKey().getAuthor().contains("A"));
		end = System.currentTimeMillis();
		System.out.println(end-start); 
	}

}

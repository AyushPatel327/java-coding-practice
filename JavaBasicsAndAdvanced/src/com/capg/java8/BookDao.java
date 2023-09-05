package com.capg.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BookDao {

	public static void main(String[] args) {
	
		List<Book> books = new ArrayList<>();
		
		Book book1 = new Book(1021, "Life of Pi", "KR");
		Book book2 = new Book(1028, "Jungle Book", "JP");
		Book book3 = new Book(1019, "Strangers things", "BB");
		Book book4 = new Book(1030, "Ghosted", "AB");
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		
		//Collections.sort(books,(b1,b2) -> b1.getName().compareTo(b2.getName()));
		//Collections.reverse(books);
		//System.out.println(books);
		
		//filter  method
		books.stream().filter(b -> b.getId()>= 1025).forEach(b -> System.out.println(b.getName()));
		
		//using Stream
		books.stream().sorted(Comparator.comparing(t -> t.getId())).forEach(System.out::println);
	
		System.err.println("Printing using method refernce: ");
		 		System.out.println(myList.stream().max(Integer::compare).get());
	
	}

}

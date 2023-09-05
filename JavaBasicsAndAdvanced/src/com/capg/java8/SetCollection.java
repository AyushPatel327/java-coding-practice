package com.capg.java8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetCollection {

	public static void main(String[] args) {
	
		HashSet<String> list = new LinkedHashSet<String>();		
		list.add("This");
		list.add("is");
		list.add("a");
		list.add("Set");
		list.add("implemtation");
		list.add(null);
		list.add(null);
		
		
		list.removeIf((a)-> a == "is");
		
		
		
		
		

		
		Iterator<String> itr = list.iterator();
		
		while (itr.hasNext()) {
			String string = itr.next();
			System.out.println(string);
			
		}
	}
}

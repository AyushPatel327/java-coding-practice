package com.capg.string.manipulation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		String string = " Java is Java, but for Java";
		String[] words = string.split("\\W");

		List<String> byStream = Stream.of(words).distinct().collect(Collectors.toList());
		
		for(String s: byStream) {
			System.out.print(s + " ");
		}
	//	Set<String> set = new LinkedHashSet<>();
//		for(String s: words) {
//			set.add(s);
//		}
//		
//		for(String s:set) {
//			System.out.print( s + " ");
//		}

		//other way using String
		
		String distinctWord = "";
		
		for(String s: words) {
			if (distinctWord.contains(s)) {
				continue;
			}
			else {
				distinctWord+=" " + s;
			}
		}
		
		System.out.println(distinctWord.trim());
	}

}

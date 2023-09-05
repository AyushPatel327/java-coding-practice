package com.mbrdi.coding2;

import java.util.stream.Stream;

public class CountVowels {

	public static void main(String[] args) {
	String str = "capgemini training";
	System.out.println( Stream.of(str.split("")).filter(t -> t.matches("[aeiou]")).count());

	}

}

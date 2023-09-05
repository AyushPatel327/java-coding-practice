package com.mbrdi.coding2;

import java.util.stream.Stream;

public class LettersInString {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 ="Jpa";
		
		if (Stream.of(s1).anyMatch((s)-> s.contains(s2))) {
			System.out.println("yes");
		}
		StringBuilder

	}

}

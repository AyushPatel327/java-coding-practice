package com.mbrdi.coding;

import java.util.Arrays;

public class StringAnagram {

	public static void checkAnagram(String str1, String str2) {

		String[] s1 = str1.toLowerCase().split("");
		String[] s2 = str2.toLowerCase().split("");

		Arrays.sort(s1);
		Arrays.sort(s2);
		
		if (Arrays.equals(s1, s2)) {
			System.out.println("Is an anagram");
		} else {
			System.out.println("Not an Anagram");
		}

	}

	public static void main(String[] args) {

		String str1 = "Hlloe";
		String str2 = "Hello";

		checkAnagram(str1, str2);

	}

}

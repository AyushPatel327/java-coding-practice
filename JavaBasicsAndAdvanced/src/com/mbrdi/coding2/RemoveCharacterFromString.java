package com.mbrdi.coding2;

public class RemoveCharacterFromString {

	public static void main(String[] args) {
		String s = "abcdefabcdeabcdaaa";
		String newS = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				continue;
			} else {
				newS += s.charAt(i);
			}
		}
		System.out.println("New string is " + newS);

//		System.out.println(Stream.of(s.split("")).allMatch((t)-> t != "a"));

	}

}

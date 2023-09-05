package com.capg.strings;

public class IndexOfCharacter {

	public static void main(String[] args) {
		char start = 'a';
		char end = 'z';

		for (char i = start; i < end; i++) {
			String string = "a";
			System.out.println(string.codePointAt(i));
			System.out.println(i);
		}

	}

}

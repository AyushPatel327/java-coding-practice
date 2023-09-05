package com.mbrdi.coding2;

public class RepeatLettersOfString {

	public static void main(String[] args) {
		String s =  "welcome"; 
		String repeatLetters = new String();
		for (int i=0; i<s.length();i++) {
			repeatLetters= repeatLetters + s.charAt(i) + s.charAt(i);
		}

		System.out.println(repeatLetters);
	}

}

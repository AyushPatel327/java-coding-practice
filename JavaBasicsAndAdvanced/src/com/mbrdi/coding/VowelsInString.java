package com.mbrdi.coding;

public class VowelsInString {

	public static int countVowels(String s) {
		String vowels = "aeiou";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
		
			
			if(vowels.contains(""+s.charAt(i))) {
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		String string = "this is a computer";

		System.out.println(countVowels(string));

	}

}

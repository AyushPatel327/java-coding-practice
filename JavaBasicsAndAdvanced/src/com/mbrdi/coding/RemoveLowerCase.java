package com.mbrdi.coding;

public class RemoveLowerCase {

	public static void removeLowerCaseCharacter(String s) {
		String newString ="";
		for(int i =0 ;i<s.length(); i++) {
			if (Character.isWhitespace(s.charAt(i))) {
				newString+=" ";
			}
			if (Character.isUpperCase(s.charAt(i))) {
				newString+=s.charAt(i);
			}
		}
		System.out.println(newString);
	}
	
	public static void main(String[] args) {
		String str = "THIS iS THe";

		removeLowerCaseCharacter(str);
	}

}

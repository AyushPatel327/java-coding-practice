package com.capg.strings;

public class LongestPalindrome {

	static boolean palindrom(String str) {
		return new StringBuilder(str).reverse().toString().equals(str);
	}

	public static void main(String[] args) {

		String string = "thequickbrownfoxxofnworbquickthe";
		String result = "";
		int i = 0;
		int j = string.length();
		
		
		while (i != j) {
			if (palindrom(string.substring(i, j))) {
				result = string.substring(i, j);
				break;
			}
			i++;
			j--;

		}
		System.out.println(result);


	}

}

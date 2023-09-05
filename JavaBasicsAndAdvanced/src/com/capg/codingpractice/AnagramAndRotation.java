package com.capg.codingpractice;

import java.util.Arrays;

public class AnagramAndRotation {

	public static boolean checkAnagram(String str1, String str2) {

		boolean result = false;
		if (str1.length() != str2.length())
			result = false;
		else {
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();

			Arrays.sort(charArray1);
			System.out.println(charArray1);
			Arrays.sort(charArray2);
			System.out.println(charArray2);

			if (Arrays.equals(charArray1, charArray2)) {
				result = true;
			}
		}
		return result;

	}

	public static void main(String[] args) {

		String str1 = "rat";

		String str2 = "art";

		System.out.println(checkAnagram(str1, str2));
	}

}

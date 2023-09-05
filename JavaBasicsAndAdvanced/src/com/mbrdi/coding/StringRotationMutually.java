package com.mbrdi.coding;

public class StringRotationMutually {

	public static String checkRotation(String s1, String s2) {
		if (s1.length() == s2.length()) {
			String newS1 = s1;
			String rotatedString = "";
			for (int i = 0; i < s1.length(); i++) {
				rotatedString = newS1.charAt(newS1.length() - 1) + newS1.substring(0, newS1.length() - 1);
				//System.out.println(rotatedString);
				newS1 = rotatedString;

				if (s2.equals(rotatedString)) {
					return "Yes";
				}
			}
			return "No";
		} else {
			return "No";
		}
	}

	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "cdeab";

		System.out.println(checkRotation(s1, s2));

	}

}

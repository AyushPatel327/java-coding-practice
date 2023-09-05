package com.mbrdi.coding;

public class CountCharacter {

	public static int countCharacter(String s, char c) {
		String newS = s.toLowerCase();
		int count = 0;

		for (int i = 0; i < newS.length(); i++) {
			if (newS.charAt(i) == c) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String str = "This is the exclusive thing";
		System.out.println(countCharacter(str, 't'));

	}

}

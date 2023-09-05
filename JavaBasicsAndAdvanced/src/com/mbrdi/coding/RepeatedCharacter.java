package com.mbrdi.coding;

public class RepeatedCharacter {

	public static void main(String[] args) {

		String str = "this his it";

		String nonRepeatedCharacers = "";
		
		String prevCharacters = "";

		for (int i = 0; i < str.length(); i++) {
			int count =1 ;
			for(int j = i+1;j<str.length();j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
					prevCharacters+=str.charAt(i);
					continue;
				}
				
			}
			if (count<=1&&prevCharacters.contains(nonRepeatedCharacters)) {
				if (Character.isSpaceChar(str.charAt(i))) {
					continue;
				}
				nonRepeatedCharacters+=str.charAt(i);
			}
			
		}
		

		System.out.println("First non-repeated character: "+nonRepeatedCharacters);
	}
}

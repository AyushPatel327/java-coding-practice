package com.mbrdi.coding2;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		String s = "Reverse words in a given string";
		String sArr[] = s.split("\\W");
 		String reverseString = "";
 		
 		for(int i = sArr.length-1 ; i>= 0; i-- ) {
 			reverseString = reverseString + sArr[i]+" ";
 		}
 		System.out.println("Reversed String : " + reverseString);
	}

}

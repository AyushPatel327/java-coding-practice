package com.mbrdi.coding;

public class AlphabetsDigits {
	
	public static String checkDigits(String str) {
		String digit =  "No";
		
		for(int i = 0;i<str.length();i++) {
			if (Character.isDigit(str.charAt(i))) {
				digit ="Yes";
				break;
			}
		}
		return digit;
	}

	public static void main(String[] args) {
	String string = "Ayush 55";
	
	System.out.println(checkDigits(string));
	
	

	}

}

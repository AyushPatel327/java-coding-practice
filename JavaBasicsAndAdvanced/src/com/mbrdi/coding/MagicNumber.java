package com.mbrdi.coding;

public class MagicNumber {

	public static void checkMagicNumber(int n) {//100
		
		int originalNumber = n;
		int sum = 0 ;
		
		while(n>9) {
			sum = 0;
			while(n!= 0) {
				int digit = n%10;
				sum+=digit;
				n = n/10;
			}
		}
		if (sum == 1 || originalNumber == 1) {
			System.out.println(originalNumber + " is a magic number");
		}
		else {
			System.out.println(originalNumber + " is not a magic number");
		}
		
	}
	
	public static void main(String[] args) {
		checkMagicNumber(99);
		

	}

}

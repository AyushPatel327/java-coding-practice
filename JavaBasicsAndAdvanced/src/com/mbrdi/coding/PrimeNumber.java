package com.mbrdi.coding;

public class PrimeNumber {

	public static void main(String[] args) {

		
		for (int n = 2; n <= 30; n++) {
			boolean p = false;
			for (int i = 2; i <= n; i++) {
				if (n % i != 0 && n%2 != 0 && n != 9) {
					p = true;
					break;
				} 
			}
		if (p) {
			System.out.println(n);
		}

		}
		
		
		//using java 8
		
		

	}

}

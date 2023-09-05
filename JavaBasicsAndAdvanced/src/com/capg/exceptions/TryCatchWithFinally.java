package com.capg.exceptions;

public class TryCatchWithFinally {

	public static void divide(int x, int y) {
		int z;
		try {
			z = x/y;
			System.out.println("z: " + z);
		} 
		catch (ArithmeticException e) {
			System.out.println("Can't divide by zero");
			for (int i = 0; i < 5; i++) {
				if(i==3)
					System.exit(0);	
			}
			
		}
		finally {
			System.out.println("This will always run");
		}
		
		
		
	}
	public static void main(String[] args) {
	//	Scanner scanner = new Scanner(System.in);
		
		divide(4, 0);

	}

}

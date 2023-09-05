package com.capg.java8;

import java.util.stream.IntStream;

public class Factorial {
	public static void main(String[] args) {
    	 int number = 5;
         int result = IntStream.rangeClosed(1, number).reduce(1, (a, b) -> a * b);
         System.out.println("Factorial of " + number + " is: " + result);
         
      
    }
}

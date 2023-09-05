package com.capg.java8;

interface Calculator {
	void divide();
}
public class FunctionalAndLambda {

	public static void main(String[] args) {
		
		Calculator calculator = () -> System.out.println(10/5);
		calculator.divide();
	}

}

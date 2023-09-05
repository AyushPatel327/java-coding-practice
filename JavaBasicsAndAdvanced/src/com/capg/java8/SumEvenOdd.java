package com.capg.java8;

import java.util.Arrays;
import java.util.List;

public class SumEvenOdd {

	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(23,51,18,46,10,76);
	
	System.out.println("Sum of even in a list: " + list.stream().filter((t)->t%2==0).mapToInt(Integer::valueOf).sum());
	
	System.out.println("Sum of odd in a list: " + list.stream().filter((t)->t%2!=0).mapToInt(Integer::valueOf).sum());
	}

}

package com.capg.java8;

import java.util.Arrays;
import java.util.List;

public class SupplierDemo {

	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("a", "b");
		
		System.out.println(list.stream().findAny().orElseGet(()-> "Hello Java"));
	}

}

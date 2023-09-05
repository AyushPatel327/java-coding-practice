package com.capg.java8;

import java.util.Arrays;
import java.util.List;

public class AverageUsingStream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(455, 2782, 398, 3778, 355);

		System.out.println(list.stream().mapToDouble(Integer::doubleValue).average().getAsDouble());

	}

}

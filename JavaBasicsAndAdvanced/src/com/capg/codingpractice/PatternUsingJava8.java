package com.capg.codingpractice;

import java.util.StringJoiner;

public class PatternUsingJava8 {

	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(",", "[", "]");

		StringJoiner joiner2 = new StringJoiner(":");

		joiner.add("A");
		joiner.add("B");
		joiner.add("C");
		joiner2.add("P").add("Q");

		System.out.println(joiner.merge(joiner2));

	}

}

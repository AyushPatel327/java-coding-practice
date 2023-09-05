package com.mbrdi.coding;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CompareStrings {

	public static void main(String[] args) {
		String s1 = "This is Bangalore 1";
		String s2 = "this is bangalore 2";

		// lexicographically
		System.out.println(s1.compareTo(s2));

		// ignoring cases
		System.out.println(s1.compareToIgnoreCase(s2));

		// print date and time in this format
		// Current Date and Time :
		// June 19, 2017
		// 3:13 pm

		LocalDateTime current = LocalDateTime.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("a");
		String amPm = current.format(formatter);

		System.out.println(current.getMonth() + " " + current.getDayOfMonth() + "," + current.getYear() + "\n"
				+ current.getHour() + ":" + current.getMinute() + " " + amPm);

		// System.out.format("",)

		String ss = "  this is it ";
		System.out.println(ss.trim());

	}

}

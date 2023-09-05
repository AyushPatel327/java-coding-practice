package com.capg.codingpractice;

public class Speeding {

	public static int caughtSpeeding(int speed, boolean isBirthday) {

		int ticket = 0;
		if (speed < 60 && isBirthday == false) {
			ticket = 0;
		} else if (speed == 65 || speed == 85 && isBirthday == true) {
			ticket = 0;
		} else if (speed > 60 && speed <= 80 && isBirthday == false) {
			ticket = 1;

		} else if (speed > 80) {
			ticket = 2;
		}
		return ticket;
	}

	public static void main(String[] args) {

		System.out.println(caughtSpeeding(85, true));
	}

}

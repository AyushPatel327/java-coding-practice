package com.capg.oops;

class School {
	private int schoolId;
	private String name;

	public static void getSchoolName(String schoolName) {
		System.out.println("School name is: " + schoolName + " parent static class method");
	}
}

class Student extends School {

	//Runtime polymorphism is not possible for static methods
	//because static methods are loaded at the compile time statically
	//@Override
	public static void getSchoolName(String schoolName) {
		System.out.println("School name is: " + schoolName + " child static class method");
	}
}

public class StaticOverloadingAndOverridingExample {

	// this is compile time polymorphism
	public static void sum(int x, int y) {

		System.out.println("sum is: " + (x + y));
	}

	public static void sum(float x, float y) {
		System.out.println("sum is: " + (x + y));
	}

	public static void main(String[] args) {

		sum(11.0f, 22.9f);
		// Student student = new Student();
		Student.getSchoolName("JVS");

	}

}

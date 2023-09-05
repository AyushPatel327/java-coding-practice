package com.capg.others;

interface Student{
	public static final int name = 1 ;
	public abstract void learning();
	
	default void drawing() {
		System.out.println("Student is drawing ");
	}
	static void talking() {
		
	}
	
}

class StudentImpl implements Student{
	
	@Override
	public void learning() {
		System.out.println("Student is learning ");
		
	}
	
	interface StudentDetails{}
	
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

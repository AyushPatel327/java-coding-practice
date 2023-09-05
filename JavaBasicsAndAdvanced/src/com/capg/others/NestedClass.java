package com.capg.others;

import com.capg.others.OuterClass.InnerClass;

class OuterClass {

	private int m = 10;

	public void m1() {
		System.out.println("Outer class Method " + m);
	}

	class InnerClass {
		private int n = 10;

		public void m1() {
			System.out.println("Inner class Method" + n);
		}
	}
}

public class NestedClass {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();

		InnerClass inner = outer.new InnerClass();

		outer.m1();
		Child child = new Child();
	}
}

class SuperParent{
	public SuperParent() {
	System.out.println("Super Parent");	
	}
}
class Parent extends SuperParent{
	int a;
	public Parent() {
		System.out.println("Hello, this is Parent class");
	}
}

class Child extends Parent{
	int b;
	{
		final int a;
	}
	Child() {
		//super();
		//System.out.println("Hello, this is child class");
	}
}

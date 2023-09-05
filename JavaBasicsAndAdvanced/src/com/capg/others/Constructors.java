package com.capg.others;


class Base {
	
	{
		System.out.println("this is instance block of base");
	}
	public Base() {
	System.out.println("Base class const");	
	}
	static {
		System.out.println("This is static block of base");
	}
}

class Sub extends Base{
	
	public Sub() {
	System.out.println("Sub class const");	
	}
	{
		System.out.println("this instance block of Sub");
	}
	static {
		System.out.println("This is static block of Sub");
	}
}
public class Constructors {
	public static void main(String[] args) {
		new Sub();
	}
}

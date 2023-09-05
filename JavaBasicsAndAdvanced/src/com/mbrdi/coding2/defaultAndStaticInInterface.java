package com.mbrdi.coding2;

interface MyInterface {

	default void printMessage() {
		System.out.println("This is the default method from my interface");
	}
}

class MyImpl implements MyInterface {

	public void printMessage() {
		MyInterface.super.printMessage();
		System.out.println("this is from impl");

	}
}

public class defaultAndStaticInInterface {

	public static void main(String[] args) {

		MyImpl objImpl = new MyImpl();

		objImpl.printMessage();
	}
}

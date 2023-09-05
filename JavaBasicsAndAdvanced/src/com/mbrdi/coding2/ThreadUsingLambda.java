package com.mbrdi.coding2;

public class ThreadUsingLambda {

	public static void main(String[] args) {
		
	Thread t1 = new Thread(()-> System.out.println("this is run method using Lamda Expression"));
	t1.start();
		

	}

}

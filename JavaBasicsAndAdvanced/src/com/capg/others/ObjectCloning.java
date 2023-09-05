package com.capg.others;

public class ObjectCloning implements Cloneable{

	int length = 3;
	int breadth = 4;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectCloning obj1  = new ObjectCloning();
		
		//shallow cloning
		ObjectCloning obj2 =  obj1;
		
		System.out.println("Shallow Cloning of object");
		System.out.println("obj1: " + obj1.length + ", " + obj1.breadth);
		obj1.length = 9;
		obj1.breadth = 8;
		
		System.out.println("obj2: " + obj2.length + ", " + obj2.breadth);
		
		ObjectCloning obj3 = (ObjectCloning) obj1.clone();
		obj1.length = 18;
		obj1.breadth = 16;
		
		System.out.println("Deep Cloning of Object");
		
		System.out.println("obj3: " + obj3.length + ", " + obj3.breadth);
		

	}

}

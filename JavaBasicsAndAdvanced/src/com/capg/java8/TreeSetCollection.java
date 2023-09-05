package com.capg.java8;

import java.util.NavigableSet;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
public class TreeSetCollection {

	public static void main(String[] args) {
		
		NavigableSet<Integer> set = new TreeSet<>();
		 
		set.add(34);
		set.add(94);
		set.add(110);
		set.add(22);
		set.add(51);
		set.add(133);
		
		System.out.println(set.floor(40));
		
		System.out.println(set.headSet(40));

		Employee employee =  new Employee(101, "Raghav");
		
// If we use generic type that is not implementing Comparable 
// 	interface then we get ClassCastException 
// thats why we implemented Comparable in Employee class
		TreeSet<Employee> empSet =  new TreeSet<>();
		empSet.add(employee);
		
		empSet.stream().forEach((a)-> System.out.println(a.getName()));
		
	}

}

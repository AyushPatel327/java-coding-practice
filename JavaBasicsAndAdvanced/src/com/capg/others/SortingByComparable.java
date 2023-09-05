package com.capg.others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student1 implements Comparable<Student1> {
	int rollno;
	String name;
	int age;

	Student1(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		return this.getAge() - o.getAge();
	}

}
//commented below code as we are only using  java8 comparator 
// and static method of comparator i.e, comparing();
/*
 * class NameComparison implements Comparator<Student1> {
 * 
 * @Override public int compare(Student1 stu1, Student1 stu2) { return
 * stu1.getName().compareTo(stu2.getName()); }
 * 
 * }
 */

public class SortingByComparable {

	public static void main(String[] args) {

		Student1 stu1 = new Student1(101, "sridhar", 34);

		Student1 stu2 = new Student1(111, "Abhishek", 23);

		Student1 stu3 = new Student1(101, "Kishan", 55);
		
		Student1 stu4 = null;

		List<Student1> list = new ArrayList<>();

		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);

		//Collections.sort(list, Collections.reverseOrder());
		
		//Using Comparator 
		//Collections.sort(list, new NameComparison());

		//java8 Comparator
		
		Comparator<Student1> cm1 = Comparator.comparing(Student1::getName);
		
		Collections.sort(list,cm1);
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Student1 student1 = (Student1) iterator.next();

			System.out.println(student1.getName() + " " + student1.getAge());

		}

	}
}

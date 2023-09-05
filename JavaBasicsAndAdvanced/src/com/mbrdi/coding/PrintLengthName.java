package com.mbrdi.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintLengthName {

	public static void main(String[] args) {

		  List<Employee> employees = new ArrayList<>();

		  

	        employees.add(new Employee(101, "Sourabh", 20000));
	        employees.add(new Employee(102, "Devraj", 20000));
	        employees.add(new Employee(103, "Raj", 20000));
	        employees.add(new Employee(104, "Deva", 20000));
	        employees.add(new Employee(104, "rajeesh", 20000));
		
		
		   Map<Integer, List<String>> resultMap = employees.stream().collect(Collectors
	                .groupingBy(e -> e.getEmpname().length(), Collectors.mapping(Employee::getEmpname, Collectors.toList())));

	 

	        System.out.println(resultMap);
		
	}

}

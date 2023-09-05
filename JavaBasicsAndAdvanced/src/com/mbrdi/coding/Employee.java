package com.mbrdi.coding;

public class Employee {

	private int eid;
	private String empname;
	private double salary;
	
	
	
	
	public Employee(int eid, String empname, double salary) {
		super();
		this.eid = eid;
		this.empname = empname;
		this.salary = salary;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", empname=" + empname + ", salary=" + salary + "]";
	}
	
	
}

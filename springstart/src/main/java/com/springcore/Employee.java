package com.springcore;

public class Employee {
	private int empID;
	private String empName;
	private int empSalary;
	private String empAddress;
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		System.out.println("setemplID called");
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		System.out.println("setemplName called");
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		System.out.println("setemplSalary called");
		this.empSalary = empSalary;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		System.out.println("setemplAddress called");
		this.empAddress = empAddress;
	}
	
	public Employee(int empID, String empName, int empSalary, String empAddress) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empSalary=" + empSalary + ", empAddress="
				+ empAddress + "]";
	}
	
	
}

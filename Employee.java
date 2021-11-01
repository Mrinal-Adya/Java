package com.flower;

import java.util.Scanner;

public class Employee {

	int employeeId;
	String employeeName;
	float basicSalary;
	float specialAllowance;
	float hra;
	float transportAllowance = .2f;
	float tax = 2500f;
	float netSalary;
	
	
	
	
	public int getEmployeeId() {
		return employeeId;
	}




	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}




	public String getEmployeeName() {
		return employeeName;
	}




	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}




	public float getBasicSalary() {
		return basicSalary;
	}




	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}


	public void set(float basicSalary) {
		
		if(basicSalary<=10000) {
			this.hra = .2f;
			this.specialAllowance = .8f;
		}
		else if(basicSalary>10001 && basicSalary <20000) {
			this.hra = .25f;
			this.specialAllowance = .9f;
		}
		else {
			this.hra = .3f;
			this.specialAllowance = .95f;
		}
	}
	
	public void totalAmount() {
		
		float netSalary = this.basicSalary + (this.basicSalary*this.hra) +(this.basicSalary*this.specialAllowance)
				+(this.basicSalary * this.transportAllowance) - this.tax;
		System.out.println(netSalary);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter basic Salary");
		e1.setBasicSalary(scan.nextInt());
		e1.setEmployeeId(1);
		e1.setEmployeeName("Joe");
		e1.set(e1.getBasicSalary());
		System.out.println("Employee ID " + e1.getEmployeeId());
		System.out.println("Employee Name is " +e1.getEmployeeName());
		System.out.println("Net Salary is ");
		e1.totalAmount();
		
		
		
		
		
	}

}

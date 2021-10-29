package com.association;

public class Student {

	
	private String name;
	private int rollno;


	public void setName(String name) {
		this.name = name;
	}

	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	private String city;
	
	public void studentDetails() {
		System.out.println("Name is " + name + " roll number is " + rollno + " lives in  " + city);
	}
	
}

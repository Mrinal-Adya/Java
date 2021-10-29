package com.association;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UndergradStudent s1 = new UndergradStudent();
		UndergradStudent s2 = new UndergradStudent();
		
		s1.setName("Ross");
		s1.setRollno(123);
		s1.setYear(2017);
		s1.setCity("Ludhiana");
		s1.studentDetails();
		s1.getYear();
		s1.branch();
		s1.society();
		
		
		s2.setName("Mike");
		s2.setRollno(128);
		s2.setYear(2017);
		s2.setCity("Shimla");
		s2.getYear();
		s2.studentDetails();
		s2.branch();
		
	
		
		
	}

}

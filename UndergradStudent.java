package com.association;

import com.associaionCar.CarEngine;
import com.associaionCar.MusicPlayer;

public class UndergradStudent extends Student {

	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	public void branch() {
		Branch b1 = new Branch();
		b1.studiesBranch();
	}
	
	public void society() {
		Society s1 =  new Society();
		s1.collegeSociety();
	}
	
}

package com.associaionCar;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Honda hondaCivic = new Honda();
		hondaCivic.setColor("red");
		hondaCivic.setSpeed(220);
		hondaCivic.carDetails();
		hondaCivic.hondaStartEngine();
		hondaCivic.hondaMusicPlayer();
		
		Honda hondaCity = new Honda();
		hondaCity.setColor("gray");
		hondaCity.setSpeed(250);
		hondaCity.carDetails();
		hondaCity.hondaStartEngine();
		
		
	}

}

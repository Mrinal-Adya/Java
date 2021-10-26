package com.associaionCar;

public class Honda extends Car {

	public void hondaStartEngine() {
		CarEngine hondaEngine = new CarEngine();
		hondaEngine.engineStarts();
	}
	
	public void hondaMusicPlayer() {
		MusicPlayer hondaMusicPlayer =  new MusicPlayer();
		hondaMusicPlayer.carMusicPlayer();
	}
	
	
}

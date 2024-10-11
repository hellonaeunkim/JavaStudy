package part_7;

public interface TV {
	
	public int MIN_VOLUME = 0; // Interface attributes are by default public, static and final
	public int MAX_VOLUME = 100;
	
	public void turnOn(); // Similar to the abstract class.
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);

}

/*
 
 interface
 
 1. "abstract class" that is used to group related methods with empty bodies.
 2. cannot be used to create objects

*/
package car;

import car.carComponents.Engine;

public class Truck extends Vehicle {
	int bedLength;
	Integer numDoors;
	Long hardware;
	Engine engine = new Engine();

	public Truck() {
		
	}
	
	public void start() {
		System.out.println("You started the car.");
	}

}

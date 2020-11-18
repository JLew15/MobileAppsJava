package car;
import car.carComponents.*;
import java.util.*;

public class Car {
	String color;
	String brand;
	Integer numDoors;
	Integer numWheels;
	Double price;
	Long hardware;
	Engine engine = new Engine();
	Scanner input = new Scanner(System.in);
	

	public Car() {
		System.out.println("What color is your car?");
		color = input.nextLine();
		System.out.println("What manufacturer is your car?");
		brand = input.nextLine();
		System.out.println("How many doors are on it?");
		numDoors = input.nextInt();
		numWheels = 4;
		System.out.println("How much does your car cost?");
		price = input.nextDouble();
		
		input.close();
		
	}
	
	public void drive() {
		if (engine.cylinders == 8) {
			System.out.println("I'm driving really fast.");
		}
		else {
			System.out.println("I'm just drivin man.");
		}
	}

}

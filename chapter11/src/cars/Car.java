package cars;

public class Car implements IDrivable,ISafety,IEntertainment{
	public String color;
	public String make;
	public String model;
	public int volume;
	public boolean seatbelt;
	public int speed;
	public int tireAngle;

	public Car() {
		volume = 0;
		seatbelt = false;
		speed = 0;
		tireAngle = 0;
		
	}

	@Override
	public void radioVolume() {
		volume ++;
		
	}

	@Override
	public void seatbelt() {
		if (seatbelt == false) {
			seatbelt = true;
		}
		else {
			seatbelt = false;
		}
		
	}

	@Override
	public void speedup(int setSpeed) {
		if (setSpeed >= speed) {
			speed = setSpeed;
		}
		else {
			return;
		}
		
	}

	@Override
	public void slowdown(int setSpeed) {
		if (setSpeed <= speed) {
			speed = setSpeed;
		}
		else {
			return;
		}
		
		
	}

	@Override
	public void turnLeft() {
		if (tireAngle >= -22) {
			tireAngle --;
		}
		else {
			return;
		}
		
	}

	@Override
	public void turnRight() {
		if (tireAngle <= 22) {
			tireAngle ++;
		}
		else {
			return;
		}
		
	}

	@Override
	public void radioTuner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void signalLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void signalRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gearShift() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startCar() {
		// TODO Auto-generated method stub
		
	}

}

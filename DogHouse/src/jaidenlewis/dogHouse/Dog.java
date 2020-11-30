package jaidenlewis.dogHouse;

public class Dog {
	private int numTimesFed = 0;
	private boolean sleeping = false;
	private String name = "Sparky";
	
	public String getName() {
		return this.name;
	}
	public void wakeUp() {
		System.out.println("WAKING UP");
		this.sleeping = this.setSleeping(false);
		this.numTimesFed = this.setNumTimesFed(0);
	}
	public int setNumTimesFed(int numTimesFed) {
		this.numTimesFed = numTimesFed;
		return numTimesFed;
	}
	public boolean setSleeping(boolean sleeping) {
		this.sleeping = sleeping;
		return sleeping;
	}
	public void sleep() {
		this.sleeping = this.setSleeping(true);
		System.out.println("SLEEPING");
	}
	public void hear(String sound) {
		if (this.sleeping == true) {
			return;
		}
		if (sound.equals(name)) {
			System.out.println("WAG TAIL");
		}
		else if (sound.equals("ding-dong")) {
			System.out.println("BARK");
		}
		else {
			return;
		}
	}
	public void feed() {
		if (this.sleeping == true) {
			return;
		}
		this.numTimesFed ++;
		if (this.numTimesFed > 2) {
			System.out.println("YAWN");
		}
		else {
			System.out.println("YUMMY");
		}
	}

	public Dog() {
		// TODO Auto-generated constructor stub
	}

}

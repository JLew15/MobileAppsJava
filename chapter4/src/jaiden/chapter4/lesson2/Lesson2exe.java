package jaiden.chapter4.lesson2;

public class Lesson2exe {

	public Lesson2exe() {
		//Variable Declaration
		
		//Whole Number Variables
		Integer moneyAmount; //4 bytes
		byte myAge; //1 byte
		short hotDogsPerYear; //2 bytes
		long dreamBank; //8 bytes
		
		//Decimal Variables
		float myGpa; //4 bytes
		//double PIE; //8 bytes
		
		// Boolean Variable (true or false)
		boolean answer; //1 byte
		
		//Char Variable (single character)
		char letter; //2 bytes
		String name;
		
		//Giving Variables Values
		moneyAmount = 2000;
		hotDogsPerYear = 500;
		myAge = 17;
		dreamBank = 9223372036854775807L;
		myGpa = 3.65F;
		final double PIE = 3.141592654;
		letter = '\u0041';
		answer = false;
		name = "Jaiden";
		
		//mathematical operators
		//+-=/?%*&^
		moneyAmount = moneyAmount + 5000;
		
		System.out.println("I have $" + moneyAmount + " in the bank.");
		System.out.println("I can eat " + hotDogsPerYear + " hotdogs in a year.");
		System.out.println("I am " + myAge + " years old.");
		System.out.println("I want to have $" + dreamBank + " in my bank account.");
		System.out.println("I have an average GPA of " + myGpa);
		System.out.println("Pi is a constant number: " + PIE);
		System.out.println("You received a(n) " + letter + " on your assignment.");
		System.out.println("You answered the question with " + answer);
		System.out.println("My name is " + name);
	}

	public static void main(String[] args) {
		new Lesson2exe();

	}

}

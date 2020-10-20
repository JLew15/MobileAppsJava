package chapter6;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumberV4 {

	public GuessMyNumberV4() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		boolean win = false;
		int diff;
		int maxRange;
		int totalGuess;
		
		System.out.println("Choose your Difficulty. Easy, Medium, or Hard");
		String result = input.nextLine();
		switch(result)
		{
			case "Easy":
				diff = 1;
				maxRange = 10;
				totalGuess = 3;
				break;
			case "easy":
				diff = 1;
				maxRange = 10;
				totalGuess = 3;
				break;
			case "Medium":
				diff = 2;
				maxRange = 50;
				totalGuess = 5;
				break;
			case "medium":
				diff = 2;
				maxRange = 50;
				totalGuess = 5;
				break;
			case "Hard":
				diff = 3;
				maxRange = 100;
				totalGuess = 10;
				break;
			case "hard":
				diff = 3;
				maxRange = 100;
				totalGuess = 10;
				break;
			default:
				diff = 4;
				maxRange = 1000;
				totalGuess = 1;
				break;
		}
		
		int theNumber = random.nextInt(maxRange) + 1;
		int guess;
		
		
		System.out.println("Welcome to the Guess My Number Game!");
		System.out.println("I'm thinking of a number between 1 and "+maxRange);
		System.out.println(String.format("You have %s guesses to get the number correct. Good luck!",  totalGuess));
		System.out.println();
		
		String guessText = String.format("Pick a number between 1 and %s", maxRange);
		
		
		for (int guess_count = 0; guess_count != totalGuess; guess_count++){
			System.out.println(guessText);
			
			//Guess One
				if (input.hasNextInt()) {
					guess = input.nextInt();
					if (guess == theNumber) {
						System.out.println("You win!");
						win = true;
					}
					else if (guess < theNumber) {
						System.out.println("Guess Higher");
					}
					else {
						System.out.println("Guess Lower");
					}
				}
				if (win) {
					break;
				}
				}
		if (win) {
			System.out.println("YOU WINNER!");
		}
		else {
			System.out.println("YOU LOSE the number was " + theNumber);
		}
		input.close();
	}

	public static void main(String[] args) {
		new GuessMyNumberV4();

	}

}

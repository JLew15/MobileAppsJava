package tictactoe;
import java.util.*;

public class TicTacToe {
	public Scanner input;
	public static String[] board;
	public String turn;
	

	public TicTacToe() {
		// Create input tool
		input = new Scanner(System.in);
		board = new String[9];
		turn = "X";
		String winner = null;
		popEmptyBoard();
		printBoard();
		introText();
		while (winner ==  null) {
			int number = getGoodInt("Enter a slot number to place your mark",9,0);
			
			if(board[number-1].equals(String.valueOf(number))) {
				board[number-1] = turn;
				if (turn.equals("X")) {
					turn = "O";
				}
				else {
					turn = "X";
				}
			}
			else {
				System.out.println("Slot already taken; re-enter slot number:");
				continue;
			}
			printBoard();
			winner = checkWinner();
		}
	if (winner.equalsIgnoreCase("draw")) {
		System.out.println("It's a draw...");
	}
	else {
		System.out.println("The winner is... "+winner);
	}
	}

	public static void main(String[] args) {
		new TicTacToe();

	}
	
	public static void popEmptyBoard() {
		for (int a = 0; a<9; a++) {
			board[a] = String.valueOf(a+1);
		}
	}
	public static void printBoard() {
		System.out.println("\t\t\t/---|---|---\\");
		System.out.println("\t\t\t| " +board[0]+" | "+board[1]+" | "+board[2]+" |");
		System.out.println("\t\t\t-------------");
		System.out.println("\t\t\t| " +board[3]+" | "+board[4]+" | "+board[5]+" |");
		System.out.println("\t\t\t-------------");
		System.out.println("\t\t\t| " +board[6]+" | "+board[7]+" | "+board[8]+" |");
		System.out.println("\t\t\t\\---|---|---/");
	}
	public static void introText() {
		System.out.println("Welcome to the greatest intellectual challenge of all time: Tic-Tac-Toe.");
		System.out.println("This is a two player version so grab your friend and let's see who's smarter.");
		System.out.println("----------------------------------------------------------------------------");
		printBoard();
		System.out.println("X will play first.");
		System.out.println();
	}
	
	public int getGoodInt(String question, int high, int low) {
		while (true) {
			int numInput;
			try {
				System.out.println(question);
				numInput = input.nextInt();
				if (!(numInput > low && numInput <= high)) {
					System.out.println("Invalid input; re-enter slot number:");
					continue;
				}
				return numInput;
			}catch(InputMismatchException e) {
				System.out.println("Invalid input; re-enter slot number:");
				input.nextLine();
				continue;
			}
		}

	}
	public String checkWinner() {
		for(int a = 0; a<8; a++) {
			String line = null;
			switch(a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			}
			else if(line.equals("OOO")) {
				return "O";
			}
		}
		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(String.valueOf(a+1))) {
				break;
			}
			else if (a == 8) {
				return "DRAW";
			}
		}
		return null;
	}
	}

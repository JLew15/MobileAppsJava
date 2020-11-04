package tictactoe;
import java.util.*;


public class TicTacToeAi {
	Scanner input = new Scanner(System.in);
	String human;
	String computer;

	public TicTacToeAi() {
		String X = "X";
		String O = "O";
		String EMPTY = " ";
		int NUM_SQUARES = 9;
		String[] board = newBoard(NUM_SQUARES,EMPTY);
		int move;

		
		
		intro();
		pieces(X,O);
		int[] legalMoves = legalMoves(board,NUM_SQUARES,EMPTY);
		String turn = "X";
		while (true) {

			printBoard(board);
		if (turn == human) {
			move = humanMove(board,NUM_SQUARES,EMPTY);
			board[move] = human;
		}
		else {
			move = humanMove(board,NUM_SQUARES,EMPTY);
			board[move] = computer;
		}
		turn = nextTurn(turn);
		String win = checkWinner(board,EMPTY);
		if (win == "X") {
			printBoard(board);
			System.out.println("X has won!");
			break;
		}
		else if (win == "O") {
			printBoard(board);
			System.out.println("O has won!");
			break;
		}
		else if (win == "DRAW") {
			printBoard(board);
			System.out.println("It's a draw!");
			break;
		}
		}
		String playAgain = getYesNo("Do you want to play again?");
		if (playAgain.equals("yes")) {
			new TicTacToeAi();
		}
		else {
			System.out.println("Thanks for playing!");
		}
	}
	
	public void intro() {
		System.out.println("Welcome to the greatest intellectual challenge of all time: Tic Tac Toe");
		System.out.println("This will be a showdown between your human brain and my silicon processor.");
		System.out.println("You will make your move known by entering a number, 0-8. The number");
		System.out.println("will correspond to the board position as illustrated:");
		System.out.println("\t\t 0 | 1 | 2 ");
		System.out.println("\t\t-----------");
		System.out.println("\t\t 3 | 4 | 5 ");
		System.out.println("\t\t-----------");
		System.out.println("\t\t 6 | 7 | 8 ");
		System.out.println("Prepare yourself, human. The ultimate battle is about to begin. \n");
	}
	
	public String getYesNo(String question) {
		String response = "";
		while (true) {
			System.out.println(question);
			response = input.nextLine();
			if (response.equalsIgnoreCase("yes")) {
				break;
			}
			else if (response.equalsIgnoreCase("no")) {
				break;
			}
		}
		return response.toLowerCase();
		
	}
	
	public int getGoodInt(String question, int low, int high) {
		while (true) {
			int numInput;
			try {
				System.out.println(question);
				numInput = input.nextInt();
				if (!(numInput >= low && numInput <= high)) {
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
	
	public void pieces(String X, String O) {
		String goFirst = getYesNo("Do you want first move?");
		if (goFirst.equals("yes")) {
			human = X;
			computer = O;
		}
		else {
			human = O;
			computer = X;
		}
	}
	
	public String[] newBoard(int NUM_SQUARES, String EMPTY) {
		String[] board = new String [NUM_SQUARES];
		for (int i = 0;i<NUM_SQUARES;i++) {
			board[i]=EMPTY;
		}
		return board;
	}
	
	public static void printBoard(String[] board) {
		System.out.println("\t\t/---|---|---\\");
		System.out.println("\t\t| " +board[0]+" | "+board[1]+" | "+board[2]+" |");
		System.out.println("\t\t-------------");
		System.out.println("\t\t| " +board[3]+" | "+board[4]+" | "+board[5]+" |");
		System.out.println("\t\t-------------");
		System.out.println("\t\t| " +board[6]+" | "+board[7]+" | "+board[8]+" |");
		System.out.println("\t\t\\---|---|---/");
	}
	
	public int[] legalMoves(String [] board, int NUM_SQUARES, String EMPTY) {
		int[] moves = new int[NUM_SQUARES];
		for (int i = 0; i<NUM_SQUARES; i++) {
			if (board[i] == EMPTY) {
				moves[i] = i;
			}
			else {
				moves[i] = -1;
			}
		}
		return moves;
	}
	
	public int humanMove(String[] board,int NUM_SQUARES, String EMPTY) {
		int[] moves = legalMoves(board,NUM_SQUARES,EMPTY);
		int move = -1;
		while (true) {
			move = getGoodInt("Where will you move? (0-8) ",0,NUM_SQUARES);
			for(int x:moves) {
				if (move == x){
					return move;
				}
			}
			System.out.println("That square is already taken.");
		}
	}
	
	public String nextTurn(String turn) {
		if (turn == "X") {
			return "O";
		}
		else {
			return "X";
		}
		
	}
	public String checkWinner(String[] board, String EMPTY) {
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
			if (board[a] == EMPTY) {
				break;
			}
			else if (a == 8) {
				return "DRAW";
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		new TicTacToeAi();

	}

}

package checkerboard;

public class Checkerboard {
	public static void printCheckerboard(int numRows, int numCols){
		for (int row=0; row<numRows; row++) {
			for(int col=0; col<numCols; col++) {
				if (row == 0 && col == 0 || row % 2 == 0 && col % 2 == 0) {
					System.out.print("#");
				}
				else if(row % 2 != 0 && col % 2 != 0) {
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		printCheckerboard(5,3);
		printCheckerboard(3,4);
		printCheckerboard(8,8);

	}

}

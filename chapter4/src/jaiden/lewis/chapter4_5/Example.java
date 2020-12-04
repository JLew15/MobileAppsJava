package jaiden.lewis.chapter4_5;
import java.util.*;

public class Example {

	public Example() {
		Scanner input = new Scanner(System.in);
		
		//System.out.println("Type something in. ");
		//String test = input.nextLine();
		
		//String.format("The input format parameter is a String that can contain a mixture of fixed text and format specifiers", "Object param");
		String result = String.format("Three blind mice %1$s", "Test");
		System.out.println(result);
		
		input.close();
	}

	public static void main(String[] args) {
		new Example();

	}

}

package chapter11;
import java.util.*;

public class Knight {
	private String name;

	public Knight() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String inputName = input.nextLine();
		setName(inputName);
	}
	
	public Knight(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

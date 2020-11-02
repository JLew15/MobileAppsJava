package chapter6;

import java.util.Scanner;

public class Chapter8 {

	public Chapter8() {
		print(true);
		String x = input("Will this work?");
		print(x);
		String y = input("testing a number input");
		print(y);
	}

	public static void main(String[] args) {
		new Chapter8();

	}
	
	public static String input(String question) {
		Scanner input = new Scanner(System.in);
		System.out.println(question);
		String x = input.next();
		return x;
	}
	
	public void print(Object x) {
		System.out.println(x);
	}

}

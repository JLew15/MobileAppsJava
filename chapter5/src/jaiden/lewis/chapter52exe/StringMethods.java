package jaiden.lewis.chapter52exe;

public class StringMethods {

	public StringMethods() {
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String myString2 = "moon";
		String myString3 = "MOON";
		
		myString2 = myString2.toUpperCase();
		myString3 = myString3.toLowerCase();
		
		System.out.println(myString2+ " "+myString3);
		
		String newsub = letters.substring(7,12);
		System.out.println(newsub);
		
		int first = letters.indexOf("J");
		int second = letters.indexOf("A");
		int third = letters.indexOf("I");
		int fourth = letters.indexOf("D");
		int fifth = letters.indexOf("E");
		int sixth = letters.indexOf("N");
		
		char one = letters.charAt(first);
		char two = letters.charAt(second);
		char three = letters.charAt(third);
		char four = letters.charAt(fourth);
		char five = letters.charAt(fifth);
		char six = letters.charAt(sixth);
		
		System.out.print(one);
		System.out.print(two);
		System.out.print(three);
		System.out.print(four);
		System.out.print(five);
		System.out.print(six);
	}

	public static void main(String[] args) {
		new StringMethods();

	}

}

package jaiden.chapter4.lesson2;

public class SimpleMath {

	public SimpleMath() {
		int age;
		char letter;
		double square_root;
		boolean answer;
		
		age = 17;
		letter = 'x';
		square_root = 1.7320508;
		answer = true;
		
		age = age + 5;
		System.out.println(age);
		age = age += 5;
		System.out.println(age);
		age++;
		
		System.out.println(age);
		System.out.println(letter);
		System.out.println(square_root);
		System.out.println(answer);
	}

	public static void main(String[] args) {
		new SimpleMath();

	}

}

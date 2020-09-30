package jaiden.chapter4.casting;

public class Casting {

	public Casting() {
		double value1 = 7.2;
		int value2 = (int)value1;
		
		int number64 = 64;
		char five = (char)number64;
		
		int value3 = 100;
		double value4 = value3;
		
		byte num1 = 127;
		Byte num2 = 127;
		java.lang.Byte num3 = -128;
		
		int maxIntValue = Integer.MAX_VALUE;
		
		System.out.println(maxIntValue);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}

	public static void main(String[] args) {
		new Casting();

	}

}

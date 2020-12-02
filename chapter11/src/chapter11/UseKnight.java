package chapter11;

public class UseKnight {

	public UseKnight() {
		Knight knight1 = new Knight();
		Knight knight2 = new Knight("Johnathan");
		System.out.println(knight1.getName());
		System.out.println(knight2.getName());
	}

	public static void main(String[] args) {
		new UseKnight();

	}

}

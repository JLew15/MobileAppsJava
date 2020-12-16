package smartphoneInterfaces;

public class Main {

	public static void main(String[] args) {
		IDialer phone1 = new iPhone();
		IDialer phone2 = new Android();
		
		phone1.call("867-5309");
		phone2.call("867-5309");

	}

}

package smartphoneInterfaces;

public class iPhone implements IDialer{
	String phoneNumber;

	public iPhone() {
		
	}

	@Override
	public void call(String phoneNumber) {
		System.out.println("iphone dialing number "+ phoneNumber);
		
	}

}

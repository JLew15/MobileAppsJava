package smartphoneInterfaces;

public class Android implements IDialer{
	String phoneNumber;

	public Android() {
		
	}

	@Override
	public void call(String phoneNumbers) {
		System.out.println("Android dialing number "+ phoneNumbers);
		
	}

}

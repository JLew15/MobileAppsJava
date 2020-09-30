package jaiden.lewis.chapter52exe;

public class Example {

	public Example() {
		String storedUsername;
		String storedPassword;
		
		storedUsername = "captainbob";
		storedPassword = "ahoy";
		
		String inputUsername = new String();
		String inputPassword = new String();
		
		inputUsername = "CAPTAINBOB";
		inputPassword = "Ahoy";
		
		boolean username = false;
		boolean password = false;
		
		if (storedUsername.equalsIgnoreCase(inputUsername)) {
			username = true;
		}
		if (storedPassword.equals(inputPassword)) {
			password = true;
		}
		
		System.out.println("Your username was " + username);
		System.out.println("Your password was " + password);
	}

	public static void main(String[] args) {
		new Example();

	}

}

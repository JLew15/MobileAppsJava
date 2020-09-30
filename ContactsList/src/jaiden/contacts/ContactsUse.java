package jaiden.contacts;

public class ContactsUse {

	public ContactsUse() {
		Contacts lydia = new Contacts();
		lydia.name = "Lydia";
		System.out.println(lydia.name);
		Contacts jaiden = new Contacts();
		jaiden.name = "Jaiden";
		System.out.println(jaiden.name);
		
		
	}

	public static void main(String[] args) {
		new ContactsUse();

	}

}

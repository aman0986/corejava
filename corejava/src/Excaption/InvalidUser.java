package Excaption;

public class InvalidUser extends Exception {
	
	public InvalidUser() {
		super("user is invalid");
	}
	
}
package Excaption;


public class TestInvalidUser {
public static void main(String[] args) {
	
	String Name = "admin";
	try {
		if (Name.equals("a dmin")) {
			System.out.println("valid");
		} else {
			throw new InvalidUser();

		} 
		System.out.println("Hello java");
		
	} catch (Exception e) {
		System.out.println(e);
		
	}
}
}

package RandomNumber;


import java.util.Random;

public class randomnumber {
	    public static void main(String[] args) {
	        Random random = new Random();

	        // Generate a random integer between 0 and 9
	        int randomNumber1 = random.nextInt(10);
	        System.out.println("Random number 1: " + randomNumber1);
	    }
}



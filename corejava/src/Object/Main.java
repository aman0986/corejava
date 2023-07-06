package Object

import java.util.Random;

public class Main {
	    public static void main(String[] args) {
	        Random random = new Random();

	        // Generate a random integer between 0 and 9
	        int randomNumber1 = random.nextInt(10);
	        System.out.println("Random number 1: " + randomNumber1);

	        // Generate a random double between 0.0 (inclusive) and 1.0 (exclusive)
	        double randomNumber2 = random.nextDouble();
	        System.out.println("Random number 2: " + randomNumber2);

	        // Generate a random boolean
	        boolean randomBoolean = random.nextBoolean();
	        System.out.println("Random boolean: " + randomBoolean);
	    }
	}

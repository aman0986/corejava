import java.util.Scanner;

public class SmallerOfTwoNumber {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int num1 = scanner.nextInt();
		
		
		System.out.println("Enter the second number");
		int num2 = scanner.nextInt();
		
		int smaller = (num1< num2)? num1:num2;
		System.out.println("The smaller of"+num1+"and"+ num2+"is:" + smaller);
	    
		
		
	

	}

}

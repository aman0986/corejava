package Excaption;
public class trycatch {
	public static void main(String[] args) {
		try {
			int a = 10;
		System.out.println("a="+a);
		
		int b = 5;
		System.out.println("b="+b);
		
		int c = a/b;
		System.out.println("aman="+c);
		String number = "100a";
		//System.out.println(number.charAt(4));
		
		}catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			
		} catch (ArithmeticException e) {
			
			System.out.println("catch block"+ e.getMessage());
			e.printStackTrace();
			
		}catch (Exception e) {
			System.out.println(" in catch of block");
			
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("after catch block");
		
	}
	
}

public class prime {
	public static void main(String[]args ) {
		int number =12;
		int count = 0;
		for(int i=2; i<number; i++) {
			if(number% i==0) {
				count++;
				System.out.println("wo no" +i);
			}
			
		}if(count== 0) {
			System.out.println("prime number");
		}else {
			System.out.println("not prime number");
		}
	}

	}

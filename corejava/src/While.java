
public class While {
	
	public static void main(String[] args) {
		int number = 371;
		int r;
		int sum =0;
		int n= number;
		while(n>0) {
			r = n%10;
			sum =sum+ (r*r*r);
			n= n/10;
			
		}if(number== sum) {
			System.out.println("yes");
			
		} else {
			System.out.println("no");
		}
	}
	

}

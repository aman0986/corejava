package in.co.rays.basic;

public class CoreJava {
	
 public static void main(String[]args ){
	
	int ring = 0;
	boolean pickup = false;
	while(pickup == false) {
		System.out.println("ringing"+ ring);
		ring++;
		if(ring>10) {
			pickup = true;
		}
		
	}
	System.out.println("missed call");
}
}		
	
	 
		 
			 


